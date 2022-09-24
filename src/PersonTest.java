public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Andrzej";
        teacher.age = 29;
        teacher.school = "WAT";
        teacher.walk();
        teacher.eat();
        teacher.sayHello();

        Footballer footballer = new Footballer();
        footballer.name = "Jacek";
        footballer.age = 18;
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
