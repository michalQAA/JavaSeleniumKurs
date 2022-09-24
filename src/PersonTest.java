public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Andrzej", 29, "WAT");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();

        Footballer footballer = new Footballer("Jacek", 18, "Sunderland");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
