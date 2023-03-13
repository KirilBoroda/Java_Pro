package areacal.hw8.hillel;

public class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getAreaOfFigures() {
        return Math.PI * radius * radius;
    }
}
