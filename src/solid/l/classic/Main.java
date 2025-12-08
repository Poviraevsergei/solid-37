package solid.l.classic;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println(rectangle.getArea());

        Square square = new Square();
        square.setSide(10);
        System.out.println(square.getArea());
    }
}
