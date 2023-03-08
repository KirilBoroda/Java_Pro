package hw7.hillel;

public class Cats extends Animals {
    @Override
    public void swim(int swiming) {
        System.out.println("Cat cant swim!!!");
    }

    @Override
    public void run(int runnig) {
        if (runnig > 200) {
            System.out.println("Cat cant run more than 200 m");
        }
        else {
            System.out.println("Cat run:" + runnig);
        }
    }
//

    public Cats(String name) {
        super(name);
    }
}
