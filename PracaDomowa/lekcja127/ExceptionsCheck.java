package lekcja127;

import java.util.Scanner;

public class ExceptionsCheck {
    // pobierz wiek od uzytkownika, jezeli bedzie mniejszy od zera to wyrzuc wyjatek invalidAgeException
    // jezeli wiek wiekszy od 18 to wypisz ze jestes pelnoletni

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();
        if (age < 0) {
            throw new InvalidAgeException("Your age is not valid");
        }
        if (age >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
    }

}
