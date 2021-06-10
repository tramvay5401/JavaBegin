package JabaBasic;

public class Construktors {
    public static void main(String[] args) {
        User user = new User(25,"Viktor");
        User user2 = new User(27,"Petr","18.05.10");
        System.out.println(user.getName());
        user.setName("Vasya");
        System.out.println(user.getName());
        System.out.println(user2.getAge());
    }
}
