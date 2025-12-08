package solid.o.good;

public class CircleService implements ShapeArea {
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
