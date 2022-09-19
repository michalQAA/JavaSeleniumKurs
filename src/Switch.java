// instrukcja sterujaca switch
public class Switch {
    public static void main(String[] args) {
        String danie = "Łosoś";

        switch (danie) {
            case "Łosoś":
                System.out.println("Cena to 35 zl");
                break;
            case "Pizza":
                System.out.println("Cena to 22 zl");
                break;
            case "Frytki":
                System.out.println("Cena to 9 zl");
                break;
            case "Schabowy":
                System.out.println("Cena to 15 zl");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }
}
