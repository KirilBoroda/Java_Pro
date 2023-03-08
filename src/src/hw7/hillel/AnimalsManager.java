package hw7.hillel;

public class AnimalsManager {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Barsik");
        cat1.swim(10);
        cat1.run(300);
        System.out.println("-------------------------------");

        Cats cat2 = new Cats("Myrzik");
        cat2.swim(1);
        cat2.run(200);
        System.out.println("-------------------------------");

        Dogs dog1 = new Dogs("Elza");
        dog1.run(400);
        dog1.swim(10);
        System.out.println("-------------------------------");

        Dogs dog2 = new Dogs("Marry");
        dog2.run(600);
        dog2.swim(25);
        System.out.println("-------------------------------");
//
        System.out.println("How many animals = " + Animals.getAnimalsCount());
    }
}
