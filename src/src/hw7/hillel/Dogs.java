package hw7.hillel;

public class Dogs extends Animals {
    @Override
    public void swim(int swiming) {
        if (swiming > 10) {
            System.out.println(getName()+ " cannot swim more than 10 meters");
        }
        else {
            System.out.println(getName()+" swim:" + swiming);
        }
    }

    @Override
    public void run(int runnig) {
        if (runnig > 500) {
            System.out.println(getName()+ " cannot run more than 500 meters ");
        }
        else {
            System.out.println(getName()+ " run:" + runnig);
        }
    }

    public Dogs(String name) {
        super(name);
    }
}
