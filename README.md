# GravityCalculator
Modify the example program to compute the position of an object after falling for 10 seconds, outputting the position in meters.

## Description
outputting the position in meters. The formula in Math notation is: `x(t) = 0.5 × at 2 + vit + xi` Variable Meaning Value a Acceleration `(m/s 2 ) -9.81 t` Time (s) 10 vi Initial velocity `(m/s)` 0 xi Initial position 0 Note: The correct value is `-490.5 m.` Java will output more digits after the decimal place, but that is unimportant.

```java
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

```
