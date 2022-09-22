public class lekcja101Auto {
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public lekcja101Auto() {

    }
    public lekcja101Auto(String marka, String model, int przebieg, int rok) {
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.rok = rok;
    }
    public void infoAuto() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Rok: " + rok);
    }
}
