package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard ord = new CoffeeOrderBoard();
        ord.add("Vladimir");
        ord.add("Oleg");
        ord.add("Andrew");
        ord.add("Rambo");
        System.out.println(ord.draw());
        ord.deliver();
        System.out.println(ord.draw());
        ord.deliver(2);
        System.out.println(ord.draw());
        ord.deliver(4);
        System.out.println(ord.draw());
    }


}
