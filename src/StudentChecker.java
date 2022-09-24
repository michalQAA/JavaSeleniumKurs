import java.util.Scanner;

public class StudentChecker {
    public static void main(String[] args) {
        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Adamiak";
        adam.numerIndeksu = 213413;
        adam.email = "adam.adamiak@gmail.com";
        adam.nick = "AA1";
        String uczelniaAdama = adam.nazwaUczelni;
    }

}
