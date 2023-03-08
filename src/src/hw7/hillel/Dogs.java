package hw7.hillel;

public class Dogs extends Animals {
    @Override
    public void swim(int swiming) {
        if (swiming > 10) {
            System.out.println("A dog cannot swim more than 10 meters");
        }
        else {
            System.out.println("Dog swim:" + swiming);
        }
    }

    @Override
    public void run(int runnig) {
        if (runnig > 500) {
            System.out.println("A dog cannot run more than 500 meters ");
        }
        else {
            System.out.println("Dog run:" + runnig);
        }
    }

    public Dogs(String name) {
        super(name);
    }
}
