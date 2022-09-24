public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "SGH";

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie za pomoca " + nick);
    }

    public void podajEmail() {
        System.out.println("Moj email to " + email);
    }
        public void podajNrIndeksu () {
        System.out.println("Moj indeks to " + numerIndeksu);
    }

    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to " + nazwaUczelni);
    }
}
