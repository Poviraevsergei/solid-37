package solid.d.good;

public class TelegramSender implements Sender {

    @Override
    public void sendMessage(String message, String to) {
        System.out.println("Send message in Telegram...");
        System.out.println(message);
        System.out.println(to);
    }
}
