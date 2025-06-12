package controller;

import model.Futsal;
import view.CurrentBooking;
import view.UserDashboard;

public class CurrentBookingController {
    private final CurrentBooking currentBooking;
    private final UserDashboard userDashboard;

    public CurrentBookingController(CurrentBooking currentBooking, UserDashboard userDashboard){
        this.currentBooking = currentBooking;
        this.userDashboard = userDashboard;
        currentBooking.getOkayBtn().addActionListener(e -> okayBtn());
    }

    public void openScreen(Futsal futsal){
        currentBooking.setTitle("Current Booking");
        currentBooking.setLocationRelativeTo(null);
        currentBooking.setResizable(false);
        currentBooking.setVisible(true);
    }

    public void okayBtn() {
        currentBooking.dispose();
    }

    public void populatePanel(Futsal futsal) {
        currentBooking.setFutsalNameField(futsal.getFutsalName());
        currentBooking.setFutsalLocationField(futsal.getFutsalLocation());
        currentBooking.setFutsalTypeField(futsal.getFutsalType());
        currentBooking.setFutsalPriceField(futsal.getFutsalPrice());
        currentBooking.setFutsalOpeningTimeField(futsal.getFutsalOpeningTime());
        currentBooking.setFutsalBookingDateField(futsal.getFutsalBookingDate());
        currentBooking.setFutsalBookingDurationField(futsal.getFutsalBookingDuration());
    }
}
