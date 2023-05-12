package fruit.hillel;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        if (this.fruits.isEmpty() || fruit.getClass().equals(this.fruits.get(0).getClass())) {
            this.fruits.add(fruit);
        } else {
            throw new IllegalArgumentException("You cannot add a fruit of a different type to the box.");
        }
    }

    public void addFruits(List<T> fruits) {
        for (T fruit : fruits) {
            this.addFruit(fruit);
        }
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : this.fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public int compare(Box<T> anotherBox) {
        float weight1 = this.getWeight();
        float weight2 = anotherBox.getWeight();
        return Float.compare(weight1, weight2);
    }

    public void merge(Box<T> anotherBox) {
        if (this.fruits.isEmpty() || anotherBox.fruits.isEmpty() ||
                this.fruits.get(0).getClass().equals(anotherBox.fruits.get(0).getClass())) {
            this.fruits.addAll(anotherBox.fruits);
            anotherBox.fruits.clear();
        } else {
            throw new IllegalArgumentException("You cannot merge boxes with different types of fruits.");
        }
    }
}
