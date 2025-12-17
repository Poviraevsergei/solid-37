package pattern.factory_method.facade;

public class HomeTheaterFacadeImpl implements HomeTheaterFacade {
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;

    public HomeTheaterFacadeImpl() {
        dvdPlayer = new DvdPlayer();
        projector = new Projector();
        screen = new Screen();
    }

    public void watchMovie(String movie) {
        projector.on();
        dvdPlayer.on();
        screen.turnDown();
        dvdPlayer.putDisc(movie);
        dvdPlayer.play();
    }

    @Override
    public void stopMovie() {
        projector.off();
        dvdPlayer.off();
        screen.turnUp();
    }
}
