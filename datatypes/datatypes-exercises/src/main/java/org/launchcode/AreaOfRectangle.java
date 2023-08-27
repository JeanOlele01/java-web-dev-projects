package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the length of the rectangle: ?");
        Double length = input.nextDouble();
        //System.out.println("The length of the rectangle is " + length );
        System.out.println("What is the width of the rectangle: ?");
        Double width = input.nextDouble();
       // System.out.println("The width of the rectangle is " + width );
        Double area = length * width;
        System.out.println("The rectangle's area is " + area);

    }
}
