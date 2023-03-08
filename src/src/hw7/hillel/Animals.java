package hw7.hillel;

public class Animals {
    private static int AnimalsCount;
    private String name;
    private int runnig;
    private int swiming;



    public void swim(int swiming) {
        System.out.println("Animals swim:" + swiming);
    }

    public void run(int runnig) {
        System.out.println("Animals run:" + runnig);
    }

    public Animals(String name) {

        this.name = name;
        AnimalsCount++;
    }

    public static int getAnimalsCount() {
        return AnimalsCount;
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

}
