package exercise.exercise6;

class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Sphere with radius: " + radius;
    }
}
