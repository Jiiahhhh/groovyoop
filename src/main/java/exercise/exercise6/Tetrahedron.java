package exercise.exercise6;

public class Tetrahedron extends ThreeDimensionalShape{
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String getDescription() {
        return "Tetrahedron with side: " + side;
    }
}
