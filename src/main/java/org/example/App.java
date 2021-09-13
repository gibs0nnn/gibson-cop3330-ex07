package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.print("What is the length of the room in feet? ");
        String strLength = scanner.next();
        System.out.print("What is the width of the room in feet? ");
        String strWidth = scanner.next();

        //Parsing
        int length = Integer.parseInt(strLength);
        int width = Integer.parseInt(strWidth);

        //Calculations
        int areaFeet = length * width;
        double areaMeters = (double) areaFeet * 0.09290304;

        //Output
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        System.out.println(areaFeet + " square feet");
        System.out.println(Math.round(areaMeters * 1000.0) / 1000.0 + " square meters");
    }
}
