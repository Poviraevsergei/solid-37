package pattern.factory_method.adapter;

public class AdapterSender extends DatabaseLogic implements Sender {

    @Override
    public void send(String message) {
        //Кому отправляем
        String to = "Sergey";
        sendMessageToViber(message, to);
    }
}
