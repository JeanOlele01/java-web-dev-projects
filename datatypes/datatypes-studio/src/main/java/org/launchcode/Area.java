package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        Double radius = input.nextDouble();
        Circle.getArea(radius);
        // Double area = 3.14 * radius * radius;
        System.out.println("The radius of a circle of radius " + radius + "is :" + Circle.getArea(radius) );
    }
}
