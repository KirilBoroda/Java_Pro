package hw7.animal;

public class Cat extends Animal {
    private static int catsCount;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

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
}
