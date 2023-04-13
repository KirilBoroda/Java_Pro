package fruit.hillel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box gg= new Box();
        List<Fruit> gf = new ArrayList<>();

        gf.add(new Apple());
        gf.add(new Apple());
        gf.add(new Apple());
        gf.add(new Apple());
        gf.add(new Apple());
        gg.addFruits(gf);
        Box gr = new Box();
        List<Fruit> gr1 = new ArrayList<>();
        gr1.add(new Apple());
        gr1.add(new Apple());
        gr1.add(new Apple());
        gr1.add(new Apple());
        gr1.add(new Apple());
        gr.addFruits(gr1);
        System.out.println(gg.getWeight());
        gr.merge(gg);
        System.out.println(gr.getWeight());
        System.out.println(gg.getWeight());
    }
}
