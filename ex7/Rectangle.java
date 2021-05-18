public class Rectangle {
    private double width;
    private double height;
    public Rectangle() {
        width = 1.0D;
        height = 1.0D;
    }
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle: " + String.format("%.3f", width) + "*" + String.format("%.3f", height);
    }
}
