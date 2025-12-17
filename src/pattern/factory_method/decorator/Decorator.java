package pattern.factory_method.decorator;

public class Decorator implements Developer {
    private final Developer developer;

    public Decorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void skill() {
        developer.skill();
    }
}
