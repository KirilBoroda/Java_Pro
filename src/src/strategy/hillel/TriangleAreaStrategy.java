package strategy.hillel;

class TriangleAreaStrategy implements ShapeAreaStrategy {
    private double base;
    private double height;

    public TriangleAreaStrategy(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
