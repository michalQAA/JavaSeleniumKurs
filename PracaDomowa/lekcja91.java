public class lekcja91 {

    public static void main(String[] args) {


        Student sluchacz1 = new Student();
        sluchacz1.imie = "Andrzej";
        sluchacz1.nazwisko = "Strejlau";
        sluchacz1.nick = "LesnyDziadek";
        sluchacz1.email = "andrzej@strejlau.pl";
        sluchacz1.numerIndeksu = 0001;

        Student sluchacz2 = new Student();
        sluchacz2.imie = "Jacek";
        sluchacz2.nazwisko = "Gmoch";
        sluchacz2.nick = "LesnyDziadek2";
        sluchacz2.email = "jaca@gmoch.pl";
        sluchacz2.numerIndeksu = 0002;

        Student[] students = new Student[2];
        students[0] = sluchacz1;
        students[1] = sluchacz2;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();

        }


    }
}
