package com.kpi.GravityCalculator;

public class GravityCalculator {

    //////
    ///Modify the example program to compute the position of an object after falling for 10 seconds, outputting the position in meters.
    //////

    public static void main(String[] args) {

        System.out.println("GravityCalculator:");

        double gravity = -9.81; //Gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        finalPosition = 0.5 * gravity + initialVelocity + initialPosition;

        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    }
}
