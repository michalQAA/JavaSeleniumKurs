public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        int number = -3;

        if(number == 0) {
            System.out.println("liczba równa zero");
        } else if (number > 0) {
            System.out.println("liczba dodatnia");
        } else if (number < -5) {
            System.out.println("liczba mniejsza od -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
            }
        }
    }
