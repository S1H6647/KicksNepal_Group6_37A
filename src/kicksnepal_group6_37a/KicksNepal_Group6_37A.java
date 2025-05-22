/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kicksnepal_group6_37a;

import controller.LandingScreenController;
import view.LandingScreen;

/**
 *
 * @author sanji
 */
public class KicksNepal_Group6_37A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LandingScreen landingScreen = new LandingScreen();
        LandingScreenController landingController = new LandingScreenController(landingScreen);
        landingController.openScreen();
    }
}
