package exercises.chapters123;
import java.util.Scanner;


public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.askUserForName();
    }

    public void askUserForName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        input.close();

        String name = input.nextLine();
        System.out.println("Hello " + name);

    }
}