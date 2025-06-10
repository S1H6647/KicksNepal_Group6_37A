
package model;

/**
 *
 * @author regmi
 */
public class Futsal {
    private int futsalId;
    private String futsalName;
    private String futsalLocation;
    private String futsalType;
    private String futsalPrice;
    private String futsalOpeningTime;
    private String futsalBookingDate;
    private String futsalBookingDuration;

    public Futsal (String futsalName, String futsalLocation, String futsalType, String futsalPrice, String futsalOpeningTime, String futsalBookingDate, String futsalBookingDuration){
        this.futsalName = futsalName;
        this.futsalLocation = futsalLocation;
        this.futsalType = futsalType;
        this.futsalPrice = futsalPrice;
        this.futsalOpeningTime = futsalOpeningTime;
        this.futsalBookingDate = futsalBookingDate;
        this.futsalBookingDuration = futsalBookingDuration;
    }

    public Futsal (String futsalName, String futsalLocation, String futsalType, String futsalPrice, String futsalOpeningTime){
        this.futsalName = futsalName;
        this.futsalLocation = futsalLocation;
        this.futsalType = futsalType;
        this.futsalPrice = futsalPrice;
        this.futsalOpeningTime = futsalOpeningTime;
    }

    public Futsal (String futsalLocation){
        this.futsalLocation = futsalLocation;
    }

//    public Futsal(String futsalLocation, String futsalType, String futsalPrice, String futsalOpeningTime) {
//        this.futsalLocation = futsalLocation;
//        this.futsalType = futsalType;
//        this.futsalPrice = futsalPrice;
//        this.futsalOpeningTime = futsalOpeningTime;
//    }

    public Futsal(String futsalBookingDate, String futsalBookingDuration, String futsalName){
        this.futsalBookingDate = futsalBookingDate;
        this.futsalBookingDuration = futsalBookingDuration;
        this.futsalName = futsalName;
    }

    public Futsal() {}

    public String getFutsalName() {
        return futsalName;
    }

    public int getFutsalID() { return futsalId; }

    public void setFutsalName(String futsalName) {
        this.futsalName = futsalName;
    }

    public String getFutsalLocation() {
        return futsalLocation;
    }

    public void setFutsalLocation(String futsalLocation) {
        this.futsalLocation = futsalLocation;
    }

    public String getFutsalType() {
        return futsalType;
    }

    public void setFutsalType(String futsalType) {
        this.futsalType = futsalType;
    }

    public String getFutsalPrice() {
        return futsalPrice;
    }

    public void setFutsalPrice(String futsalPrice) {
        this.futsalPrice = futsalPrice;
    }

    public String getFutsalOpeningTime() {
        return futsalOpeningTime;
    }

    public void setFutsalOpeningTime(String futsalOpeningTime) {
        this.futsalOpeningTime = futsalOpeningTime;
    }

    public String getFutsalBookingDate() {
        return futsalBookingDate;
    }

    public void setFutsalBookingDate(String futsalBookingDate) {
        this.futsalBookingDate = futsalBookingDate;
    }

    public String getFutsalBookingDuration() {
        return futsalBookingDuration;
    }

    public void setFutsalBookingDuration(String futsalBookingDuration) {
        this.futsalBookingDuration = futsalBookingDuration;
    }
}
