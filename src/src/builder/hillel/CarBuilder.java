package builder.hillel;

abstract class CarBuilder {
    protected Car car;

    public void createCar() {
        car = new Car();
    }

    public abstract void buildEngine();
    public abstract void buildWheels();
    public abstract void buildBody();

    public Car getCar() {
        return car;
    }
}
