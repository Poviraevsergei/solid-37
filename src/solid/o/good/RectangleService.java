package solid.o.good;

public class RectangleService implements ShapeArea {
    private double width;
    private double height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}
