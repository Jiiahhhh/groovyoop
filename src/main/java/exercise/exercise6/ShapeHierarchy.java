package exercise.exercise6;

public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Triangle(3,2),
                new Cube(3),
                new Sphere(2),
                new Tetrahedron(5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.getDescription());

            if (shape instanceof TwoDimensionalShape) {
                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Area: " + ((ThreeDimensionalShape) shape).getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
