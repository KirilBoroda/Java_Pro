package fruit.hillel;


import java.util.ArrayList;
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
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
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
