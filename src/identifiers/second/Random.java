package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa potomna w innej paczce nie ma dostepu do pol/metod private, default oraz protected

    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        parent.fourthMethod();
    }
}
