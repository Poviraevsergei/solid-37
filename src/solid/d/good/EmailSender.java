package solid.d.good;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String message, String to) {
        System.out.println("Sending email...");
        System.out.println("Message: " + message);
        System.out.println("To: " + to);
    }
}
