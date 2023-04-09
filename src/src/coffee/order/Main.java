package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard ord = new CoffeeOrderBoard();
        ord.add("Vladimir");
        ord.add("Oleg");
        ord.add("Andrew");
        ord.add("Rambo");
        ord.draw();
        ord.deliver();
        ord.draw();
        ord.deliver(2);
        ord.draw();
        ord.deliver(4);
        ord.draw();
    }


}
