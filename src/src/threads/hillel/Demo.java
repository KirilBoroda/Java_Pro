package threads.hillel;

public class Demo {
    public static void main(String[] args) {
        ValueCalculator calculator = new ValueCalculator(1000000);
        calculator.calculateValues();
    }
}
