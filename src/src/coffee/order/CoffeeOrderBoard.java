package coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    private int nextOrderNumber = 1;
    private Map<Integer, Order> orders = new HashMap<>();

    public void add(String customerName) {
        orders.put(nextOrderNumber, new Order(nextOrderNumber, customerName));
        nextOrderNumber++;
    }

    public void deliver() {
        int orderNumber = orders.keySet().iterator().next();
        orders.remove(orderNumber);
    }

    public void deliver(int orderNumber) {
        orders.remove(orderNumber);
    }

    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("=============\n");
        sb.append("Num | Name\n");
        for (int orderNumber : orders.keySet()) {
            Order order = orders.get(orderNumber);
            sb.append(orderNumber).append("   | ").append(order.getCustomerName()).append("\n");
        }
        return sb.toString();
    }
}
