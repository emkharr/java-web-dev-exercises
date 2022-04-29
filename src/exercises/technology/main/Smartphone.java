package exercises.technology.main;

public class Smartphone extends Computer{
    private Boolean isScreenBroken;

    public Smartphone(String brand, int screenSize, int gbOfStorage) {
        super(brand, screenSize, gbOfStorage);
        isScreenBroken = false;
    }

    public Boolean getScreenBroken() {
        return isScreenBroken;
    }

    public void setScreenBroken(Boolean screenBroken) {
        isScreenBroken = screenBroken;
    }

    public boolean brokeScreen() {
        isScreenBroken = true;
        System.out.println("Your screen broke...");
        return false;
    }


}
