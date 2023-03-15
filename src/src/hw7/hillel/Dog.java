package hw7.animal;

public class Dog extends Animal {
    private static int dogsCount;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    @Override
    public void swim(int swiming) {
        if (swiming > 10) {
            System.out.println(getName() + " cannot swim more than 10 meters");
        } else {
            System.out.println(getName() + " swim:" + swiming);
        }
    }

    @Override
    public void run(int runnig) {
        if (runnig > 500) {
            System.out.println(getName() + " cannot run more than 500 meters ");
        } else {
            System.out.println(getName() + " run:" + runnig);
        }
    }
}
