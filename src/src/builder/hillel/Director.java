package builder.hillel;

class Director {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder builder) {
        carBuilder = builder;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }

    public void constructCar() {
        carBuilder.createCar();
        carBuilder.buildEngine();
        carBuilder.buildWheels();
        carBuilder.buildBody();
    }
}

