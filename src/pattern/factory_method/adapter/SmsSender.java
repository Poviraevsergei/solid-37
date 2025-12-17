package pattern.factory_method.adapter;

public class SmsSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
