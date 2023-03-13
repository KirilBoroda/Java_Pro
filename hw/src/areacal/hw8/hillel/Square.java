package areacal.hw8.hillel;

public class Square implements Area {
    private double side;

    // Конструктор для квадрата
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getAreaOfFigures() {
        return side*side;
    }
}
