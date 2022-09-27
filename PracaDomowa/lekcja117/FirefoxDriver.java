package lekcja117;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w Firefox");
    }
}
