package pattern.factory_method.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacadeImpl facade = new HomeTheaterFacadeImpl();
        facade.watchMovie("Titanic");
        facade.stopMovie();
    }
}
