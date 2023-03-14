package hw7.hillel;

public class Cats extends Animals {
    private static int CatsCount;
    @Override
    public void swim(int swiming) {
        System.out.println(getName() + " cant swim!!!");
    }

    @Override
    public void run(int runnig) {
        if (runnig > 200) {
            System.out.println(getName() + " cant run more than 200 m");
        } else {
            System.out.println(getName() + " run:" + runnig);
        }
    }
    public static int getCatsCount() {
        return CatsCount;
    }

    public Cats(String name) {
        super(name);
        CatsCount++;
    }
}
