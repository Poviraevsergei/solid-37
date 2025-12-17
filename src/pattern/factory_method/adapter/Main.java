package pattern.factory_method.adapter;

public class Main {
    public static void main(String[] args) {
        Sender sender = new AdapterSender();
        sender.send("Adapter important :)");
    }
}































