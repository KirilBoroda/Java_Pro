package hw7.hillel;

public class Cats extends Animals {
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


    public Cats(String name) {
        super(name);
    }
}
