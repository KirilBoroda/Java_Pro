package builder.hillel;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder sedanCarBuilder = new SedanCarBuilder();
        director.setCarBuilder(sedanCarBuilder);

        director.constructCar();

        Car car = director.getCar();
        System.out.println(car.getDetails());
    }
}