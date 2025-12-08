package solid.o.good;

public class SquareService implements ShapeArea {
    private double side;

    @Override
    public double calculateArea() {
        return side * side;
    }
}
