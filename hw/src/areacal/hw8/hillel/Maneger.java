package areacal.hw8.hillel;

public class Maneger {
    public static void main(String[] args) {
        Area[] figures = new Area[3];
        figures[0] = new Circle(2.0);
        figures[1] = new Triangle(3.0, 4.0);
        figures[2] = new Square(5.0);

        double totalArea = 0.0;

        {
            for (int i = 0; i < figures.length; i++) {
                totalArea += figures[i].getAreaOfFigures();

            }
        }

        System.out.println("Total area of all: " + totalArea);

    }
}
