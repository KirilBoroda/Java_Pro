package strategy.hillel;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Shape(new RectangleAreaStrategy(5, 10));
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());

        Shape triangle = new Shape(new TriangleAreaStrategy(4, 6));
        System.out.println("Площа трикутника: " + triangle.calculateArea());


        triangle.setAreaStrategy(new TriangleAreaStrategy(7, 8));
        System.out.println("Нова площа трикутника: " + triangle.calculateArea());
    }
}