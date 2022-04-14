package org.launchcode.java.studios.areaofacircle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area areaOfCircle = new Area();
        areaOfCircle.areaOfCircle();
    }

    public void areaOfCircle() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        Double radius = input.nextDouble();
        if (radius <= 0) {
            System.err.println("Error");
            System.exit(0);
        }
//        while (radius <=0 || !input.match("\\d*[.]\\d+") || !input.match("\\d+")){
//            System.out.println("Error. Enter a radius: ");
//            radius = input.nextDouble();
//        };
        input.close();


        Double area = Circle.getArea(radius);

        System.out.println("The area of a circle of "+radius+" radius is: "+area);
    }
}
