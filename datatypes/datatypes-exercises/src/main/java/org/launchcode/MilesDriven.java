package org.launchcode;

import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles you drove?:");
        Double miles = input.nextDouble();
        System.out.println("what is the amount of Gas consumed? ");
        Double gallon = input.nextDouble();
        Double milesPerGallons = miles / gallon;
        System.out.println("You drove " + milesPerGallons + "miles per Gallons");
    }
}
