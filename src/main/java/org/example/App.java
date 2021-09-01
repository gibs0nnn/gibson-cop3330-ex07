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
        System.out.print("What is the length of the room in feet? ");
        int length = scanner.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = scanner.nextInt();

        int areaFeet = length * width;
        double areaMeters = (double) areaFeet * 0.09290304;

        System.out.println("The area is");
        System.out.println(areaFeet + " square feet");
        System.out.println(areaMeters + " square meters");
    }
}
