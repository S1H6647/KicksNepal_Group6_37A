/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sanji
 */
public class User {
    private int id;
    private String username;
    private String phoneNum;
    private String email;
    private String password;
    private String favFood;
    private String favPet;

    public User() {}

    //TODO: SignUp
    public User (String username, String phoneNum, String email, String password){
        this.username = username;
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;
    }

    //TODO: Login
    public User (String email, String password) {
        this.email = email;
        this.password = password;
    }

    //TODO: Security Questions
    public User (String email, String favFood, String favPet){
        this.email = email;
        this.favFood = favFood;
        this.favPet = favPet;
    }

    //TODO: Forgot Password
    public User (String email, String favFood, String favPet, String password, boolean isForgotPassword){
        this.email = email;
        this.favFood = favFood;
        this.favPet = favPet;
        if (isForgotPassword) {
            this.password = password;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavPet() {
        return favPet;
    }

    public void setFavPet(String favPet) {
        this.favPet = favPet;
    }
}
