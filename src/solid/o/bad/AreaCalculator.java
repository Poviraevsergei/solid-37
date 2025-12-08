package solid.o.bad;

public class AreaCalculator {
    public double calculateArea(String shape, double... parameters) {
        switch (shape) {
            case "circle":
                return Math.PI * Math.pow(parameters[0], 2);
            case "rectangle":
                return Math.PI * Math.pow(parameters[0], 3);
            case "square":
                return Math.pow(parameters[0], 2);
            default:
                throw new IllegalArgumentException("Shape " + shape + " not supported");
        }
    }
}
