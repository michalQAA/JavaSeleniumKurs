import java.util.Scanner;

public class lekcja78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj swój wiek");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 18 && number > 0) {
            System.out.println("Cześć Twój wiek to " + number + ". Nie możesz kupić alkoholu !");
        } else if (number <= 0) {
            System.out.println("Wprowadź poprawną liczbę");
        }
        else   {
            System.out.println("Cześć Twój wiek to " + number + ". Dziękujemy za zakupy");
        }
    }


}
