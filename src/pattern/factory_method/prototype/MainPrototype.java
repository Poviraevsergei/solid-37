package pattern.factory_method.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        User user1 = new User("Sadam", 51);
        User user2 = (User) user1.clone();
        System.out.println(user1);
        System.out.println(user2);

        user2.setName("NEW_FILED");

        System.out.println(user1);
        System.out.println(user2);
    }
}
