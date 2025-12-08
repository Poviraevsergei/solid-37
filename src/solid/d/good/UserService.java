package solid.d.good;

public class UserService {
    public Sender emailSender;

    public UserService(Sender sender) {
        this.emailSender = sender;
    }

    public void registration(){
        //регистрирует пользователя
        emailSender.sendMessage("You good", "Adam Hus");
    }
}
