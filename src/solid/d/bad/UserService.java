package solid.d.bad;

public class UserService {
    public EmailSender emailSender;

    public UserService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void registration(){
        //регистрирует пользователя
        emailSender.sendEmailMessage();
    }
}
