package fruit.hillel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        List<Fruit> listFruits1 = new ArrayList<>();
        listFruits1.add(new Apple());
        listFruits1.add(new Apple());
        listFruits1.add(new Apple());
        listFruits1.add(new Apple());
        listFruits1.add(new Apple());
        box1.addFruits(listFruits1);
        Box box2 = new Box();
        List<Fruit> listFruits2 = new ArrayList<>();
        listFruits2.add(new Apple());
        listFruits2.add(new Apple());
        listFruits2.add(new Apple());
        listFruits2.add(new Apple());
        listFruits2.add(new Apple());
        box2.addFruits(listFruits2);
        System.out.println(box1.getWeight());
        box2.merge(box1);
        System.out.println(box2.getWeight());
        System.out.println(box1.getWeight());
    }
}
