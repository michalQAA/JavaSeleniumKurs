public class lekcja117interfaceFirefoxDriver implements lekcja117interfaceWebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w Firefox");
    }
}
