package controller;

import dao.FutsalDao;
import model.Futsal;
import model.User;
import view.BookNowScreen;
import view.UserDashboard;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class BookNowScreenController {
    private final BookNowScreen bookNowScreen;
    private final UserDashboard userDashboard;
    private final Futsal futsal;
    private final FutsalDao futsalDao = new FutsalDao();
    private final User user;

    public BookNowScreenController(BookNowScreen bookNowScreen, UserDashboard userDashboard, Futsal futsal, User user){
        this.bookNowScreen = bookNowScreen;
        this.userDashboard = userDashboard;
        this.futsal = futsal;
        this.user = user;

        bookNowScreen.getBookNowBtn().addActionListener(e -> bookNowBtn(futsal));
        bookNowScreen.getCancelBtn().addActionListener(e -> cancelBtn());
    }

    public void openScreen(){
        bookNowScreen.getFutsalNameField().setText(futsal.getFutsalName());
        bookNowScreen.setTitle("Book the futsal!");
        bookNowScreen.setLocationRelativeTo(null);
        bookNowScreen.setResizable(false);
        bookNowScreen.setVisible(true);
    }

    public void closeScreen(){
        bookNowScreen.dispose();
    }

    public void bookNowBtn(Futsal futsal) {
        Date rawDate = bookNowScreen.getBookingDate().getDate();

        // Optional: Format for display
        String date = new SimpleDateFormat("E MMM dd, yyyy").format(rawDate);

        // Convert to LocalDate for comparison
        LocalDate selectedDate = rawDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate today = LocalDate.now();

        // Check if selected date is today or in the future
        boolean isValid = !selectedDate.isBefore(today);
        if (!isValid){
            JOptionPane.showMessageDialog(bookNowScreen, "You can not enter the older dates!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String time = bookNowScreen.getBookingDuration().getText();
        if (date == null ||time.isEmpty()) {
            JOptionPane.showMessageDialog(bookNowScreen, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(time) > 2){
            JOptionPane.showMessageDialog(bookNowScreen, "Can not book the futsal for more than 2 hours!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            boolean isBooked = futsalDao.checkBooking(futsal);
            if (!isBooked){
                String futsalName = futsal.getFutsalName();
                futsal = new Futsal(date, time, futsalName);
                boolean isOkay = futsalDao.bookFutsal(futsal);
                closeScreen();
                if (isOkay) {
                    JOptionPane.showMessageDialog(bookNowScreen, "Booking confirmed for " + futsal.getFutsalName());
                    userDashboard.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(bookNowScreen, "Booking failed: Can not book more than 1 futsal!","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void cancelBtn() {
        closeScreen();
        userDashboard.setVisible(true);
    }
}
