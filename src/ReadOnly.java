public class ReadOnly {
 // getter i setter - pozwala na pobranie i modyfikacje zmiennych
    private String name2 = "Andrzej";

    public String getName() {
        return name2;
    }

    private String name3 = "Jacek";
    public void setName (String name3) {
        this.name3 = name3;
    }
}
