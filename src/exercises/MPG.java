package exercises;

import java.util.Scanner;

public class MPG {
    public static void main (String [] args) {
        MPG mpg = new MPG();
        mpg.milesPerGallon();
    }

    public void milesPerGallon () {
        Scanner input = new Scanner(System.in);

       System.out.println("Miles driven:");
        Float miles = input.nextFloat();

        System.out.println("Gas consumed (gal):");
        Float gas = input.nextFloat();

        input.close();

        Float mpg = miles * gas;

        System.out.println("You got " + mpg.toString() + "mpg.");
    }
}
