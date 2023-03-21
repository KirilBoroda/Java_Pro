package src.areacal.hw8.hillel;

public class Maneger {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Triangle(3.0, 4.0);
        shapes[2] = new Square(5.0);

        double totalArea = Shape.calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);;
    }
}
