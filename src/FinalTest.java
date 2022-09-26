public class FinalTest {

    public static void main(String[] args) {

        // pola typu final sa niezmienne, nie mozemy przypisac do nich nowego obiektu, mozemy za to je edytowac
        final int x = 2;
        final Person person = new Person("Janusz", 26);
        person.age = 25;
    }
}
