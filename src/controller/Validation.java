/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author sanji
 */
public class Validation {
    private static final String phoneRegex = "^(98|97)[0-9]{8}$";

    private static final String emailRegex =  "^[a-z0-9+_.-]+@[A-Za-z]{2,}\\.[A-Za-z]{2,3}+$";

//    private static final String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%*?&])[A-Za-z\\d@#$!%*?&]{8,}$";
    private static final String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%*?&_-]).{8,}$";

    private static final String futsalTypeRegex = "^[0-9]$";

    private static final String futsalOpeningTimeRegex = "^[0-9]-[0-9]$";

    public boolean isValidPhoneNumber(String phoneNum){
        return phoneNum.matches(phoneRegex);
    }
    
    public boolean isValidEmail(String email){
        return !email.matches(emailRegex);
    }
    
    public boolean isValidPassword(String password){
        return !password.matches(passwordRegex);
    }

    public boolean isValidFutsalType(String futsalType){
        return futsalType.matches(futsalTypeRegex);
    }

    public boolean isValidFutsalOpeningTime(String futsalOpeningTime){
        return futsalOpeningTime.matches(futsalOpeningTimeRegex);
    }
}
