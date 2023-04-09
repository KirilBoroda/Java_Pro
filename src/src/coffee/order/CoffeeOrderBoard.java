package coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    private int nextOrderNumber = 1;
    private Set<Integer> orderNumbers = new HashSet<>();
    private Map<Integer, Order> orders = new HashMap<>();

    public void add(String customerName) {
        orderNumbers.add(nextOrderNumber);
        orders.put(nextOrderNumber, new Order(nextOrderNumber, customerName));
        nextOrderNumber++;
    }

    public void deliver() {
        int orderNumber = orderNumbers.iterator().next();
        orderNumbers.remove(orderNumber);
        orders.remove(orderNumber);
    }

    public void deliver(int orderNumber) {
        orderNumbers.remove(orderNumber);
        orders.remove(orderNumber);
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (int orderNumber : orderNumbers) {
            Order order = orders.get(orderNumber);
            System.out.println(orderNumber + "   | " + order.getCustomerName());
        }
    }
}

