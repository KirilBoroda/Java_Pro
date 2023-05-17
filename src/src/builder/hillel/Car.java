package builder.hillel;

class Car {
    private String engine;
    private String wheels;
    private String body;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetails() {
        return "Деталі автомобіля:\n" +
                "Двигун: " + engine + "\n" +
                "Колеса: " + wheels + "\n" +
                "Кузов: " + body;
    }
}
