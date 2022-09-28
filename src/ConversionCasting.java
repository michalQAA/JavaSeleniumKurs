import lekcja117.FirefoxDriver;
import lekcja117.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b; // a zostaje przekonwertowana na double (konwersja niejawna)

       // int d = a/b; nie mozna wykonac bo konwersja by ucinala koncowe z double

        int d = a/(int) b;
        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();
    }
}
