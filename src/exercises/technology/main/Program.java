package exercises.technology.main;

public class Program {
    //three JUnit tests per class
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("iphone", 5, 500);
        myPhone.brokeScreen();
        int results = myPhone.basicMath();
        System.out.println(myPhone.getId());

        Laptop myLaptop = new Laptop("mac", 13, 500);
        System.out.println(myLaptop.getId());

    }
}
