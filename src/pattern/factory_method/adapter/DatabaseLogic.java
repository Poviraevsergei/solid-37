package pattern.factory_method.adapter;

public class DatabaseLogic {
    //.......//
    Boolean sendMessageToViber(String message, String username) {
        System.out.println("Send message to viber: " + message + ", username: " + username);
        return true;
    }
    //.......//
}
