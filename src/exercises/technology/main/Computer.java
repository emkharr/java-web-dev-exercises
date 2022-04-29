package exercises.technology.main;

public class Computer extends AbstractEntity {
    private String brand;
    private int screenSize;
    private int gbOfStorage;



    public Computer(String brand, int screenSize, int gbOfStorage) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.gbOfStorage = gbOfStorage;
    }

    public String getBrand() {
        return brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getGbOfStorage() {
        return gbOfStorage;
    }

    public boolean isMac(String brand) {
        if (brand.toLowerCase() == "mac") return true;
        else return false;
    }

    public int basicMath(){
        return 2+2;
    }
}
