package factory.hillel;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture table = factory.createFurniture("table");
        System.out.println("Створено стіл");

        Furniture chair = factory.createFurniture("chair");
        System.out.println("Створено стілець");
    }
}