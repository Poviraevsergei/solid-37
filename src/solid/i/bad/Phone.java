package solid.i.bad;

public class Phone implements Device {
    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fax() {
        //не надо так :(
    }

    @Override
    public void call() {
        System.out.println("Phone call");
    }
}
