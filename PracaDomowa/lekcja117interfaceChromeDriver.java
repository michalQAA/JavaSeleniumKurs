public class lekcja117interfaceChromeDriver implements lekcja117interfaceWebDriver{

    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w Chrome");
    }
}
