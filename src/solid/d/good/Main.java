package solid.d.good;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(new TelegramSender());
        userService.registration();
    }
}
