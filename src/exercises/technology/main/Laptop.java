package exercises.technology.main;

public class Laptop extends Computer{
    private Boolean isMac;

    public Laptop(String brand, int screenSize, int gbOfStorage) {
        super(brand, screenSize, gbOfStorage);
        this.isMac = true;
    }

    public Laptop(String brand, int screenSize, int gbOfStorage, Boolean isMac) {
        super(brand, screenSize, gbOfStorage);
        this.isMac = isMac;
    }

    public Boolean getMac() {
        return isMac;
    }

    public boolean whoops() {
        this.isMac = false;
        System.out.println("Laptop is actually a PC");
        return false;
    }
}
