
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
    
    public Futsal (String futsalName, String futsalLocation, String futsalType, String futsalPrice, String futsalOpeningTime){
        this.futsalName = futsalName;
        this.futsalLocation = futsalLocation;
        this.futsalType = futsalType;
        this.futsalPrice = futsalPrice;
        this.futsalOpeningTime = futsalOpeningTime;
    }

    public String getFutsalName() {
        return futsalName;
    }

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
}
