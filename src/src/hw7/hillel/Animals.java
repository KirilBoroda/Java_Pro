package hw7.animal;

public class Animal {
    private static int AnimalCount;
    private String name;
    private int runnig;
    private int swiming;

    public Animal(String name) {

        this.name = name;
        AnimalCount++;
    }

    public static int getAnimalCount() {
        return AnimalCount;
    }

    public String getName() {
        return name;
    }

    public int getRunnig() {
        return runnig;
    }

    public int getSwiming() {
        return swiming;
    }

    public void swim(int swiming) {
        System.out.println("Animals swim:" + swiming);
    }

    public void run(int runnig) {
        System.out.println("Animals run:" + runnig);
    }
}
