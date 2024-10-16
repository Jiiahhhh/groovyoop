package exercise.exercise6;

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String getDescription() {
        return "Triangle with side: " + base + ", height: " + height;
    }
}
