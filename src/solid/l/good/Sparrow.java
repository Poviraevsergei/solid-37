package solid.l.good;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Chik chik");
    }
}
