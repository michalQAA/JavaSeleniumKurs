public class User {

    public String username;
    public String password;

    public User() {

    }
    public User(String user, String pass) { // mozna dac tez tutaj username i password tylko potem trzeba sie odwolac this.username
        System.out.println("Hello z konstruktora");
        username = user;
        password = pass;
    }
    public void sayHello() {
        System.out.println("Hello my name is " + username);
    }
}
