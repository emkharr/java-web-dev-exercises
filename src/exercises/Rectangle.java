package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle areaOfRectangle = new Rectangle();
        areaOfRectangle.areaOfRectangle();
    }

    public void areaOfRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        Float length = input.nextFloat();

        System.out.println("What is the width of your rectangle?");
        Float width = input.nextFloat();

        input.close();

        Float area = length * width;
        System.out.println("Your rectangle is " + area.toString() + "inches squared.");

    }
}
