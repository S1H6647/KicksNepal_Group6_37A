package controller;

import dao.FutsalDao;
import model.Futsal;
import model.User;
import view.BookNowScreen;
import view.UserDashboard;

import javax.swing.*;

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

        bookNowScreen.getBookNowBtn().addActionListener(e -> bookNowBtn());
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

    public void bookNowBtn() {
        String date = bookNowScreen.getBookingDate().getText(); // Example field
        String time = bookNowScreen.getBookingDuration().getText(); // Example field
        if (date.isEmpty() || time.isEmpty()) {
            JOptionPane.showMessageDialog(bookNowScreen, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Futsal futsal1 = new Futsal(date, time, futsal.getFutsalName());
            boolean isValid = futsalDao.bookFutsal(futsal1);

            if (isValid) {
                JOptionPane.showMessageDialog(bookNowScreen, "Booking confirmed for " + futsal.getFutsalName());
                closeScreen();
                userDashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(bookNowScreen, "Booking failed: ","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void cancelBtn() {
        closeScreen();
        userDashboard.setVisible(true);
    }
}
