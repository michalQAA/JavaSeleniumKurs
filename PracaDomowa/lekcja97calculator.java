import java.util.Scanner;

public class lekcja97calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int number = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę");
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        int dodawanie = calculator.dodawanie(number, number2);
        int odejmowanie = calculator.odejmowanie(number, number2);
        int mnozenie = calculator.mnozenie(number, number2);
        int dzielenie = calculator.dzielenie(number, number2);
        int modulo = calculator.modulo(number, number2);

        System.out.println("Dodawanie " + dodawanie);
        System.out.println("Odejmowanie " + odejmowanie);
        System.out.println("Mnozenie " + mnozenie);
        System.out.println("Dzielenie " + dzielenie);
        System.out.println("Modulo " + modulo);
    }
}
