package solid.i.good;

public class Phone implements CallableCustom{
    @Override
    public void call() {
        System.out.println("Phone call");
    }
}
