package builder.hillel;

class SedanCarBuilder extends CarBuilder {
    @Override
    public void buildEngine() {
        car.setEngine("Двигун для седана");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Колеса для седана");
    }

    @Override
    public void buildBody() {
        car.setBody("Кузов седана");
    }
}
