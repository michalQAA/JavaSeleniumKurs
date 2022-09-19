// umozliwia cykliczne wykonanie ciagu funkcji okreslona liczbe razy
public class PetlaFor {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i = i + 2) {// zmienna sterujaca - ustawia wartosc poczatkowa
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            if (i%5==0) {
                System.out.println(i);
            }
        }
    }
}
