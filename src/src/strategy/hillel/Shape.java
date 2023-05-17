package strategy.hillel;

class Shape {
    private ShapeAreaStrategy areaStrategy;

    public Shape(ShapeAreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public void setAreaStrategy(ShapeAreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public double calculateArea() {
        return areaStrategy.calculateArea();
    }
}