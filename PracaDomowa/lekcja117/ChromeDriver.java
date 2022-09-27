package lekcja117;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w Chrome");
    }
}
