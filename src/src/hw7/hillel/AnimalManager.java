package hw7.animal;

public class AnimalManager {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        cat1.swim(10);
        cat1.run(300);
        System.out.println("-------------------------------");

        Cat cat2 = new Cat("Myrzik");
        cat2.swim(1);
        cat2.run(200);
        System.out.println("-------------------------------");

        Dog dog1 = new Dog("Elza");
        dog1.run(400);
        dog1.swim(10);
        System.out.println("-------------------------------");

        Dog dog2 = new Dog("Marry");
        dog2.run(600);
        dog2.swim(25);
        System.out.println("-------------------------------");

        System.out.println("How many cats = " + Cat.getCatsCount());
        System.out.println("How many dogs = " + Dog.getDogsCount());
    }
}
