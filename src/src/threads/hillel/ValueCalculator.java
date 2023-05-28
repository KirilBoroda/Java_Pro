package threads.hillel;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValueCalculator {

    private static final Logger LOGGER = Logger.getLogger(ValueCalculator.class.getName());

    private double[] arr;
    private int size;
    private int halfSize;

    public ValueCalculator(int size) {
        this.size = size;
        this.halfSize = size / 2;
        this.arr = new double[size];
    }

    public int getSize() {
        return size;
    }

    public int getHalfSize() {
        return halfSize;
    }

    public void calculateValues() {
        long start = System.currentTimeMillis();
        Arrays.fill(arr, 1.0);
        double[] a1 = new double[halfSize];
        double[] a2 = new double[halfSize];
        System.arraycopy(arr, 0, a1, 0, halfSize);
        System.arraycopy(arr, halfSize, a2, 0, halfSize);

        Thread t1 = new Thread(new CalculationTask(a1, 0, halfSize));
        Thread t2 = new Thread(new CalculationTask(a2, halfSize, halfSize));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.arraycopy(a1, 0, arr, 0, halfSize);
        System.arraycopy(a2, 0, arr, halfSize, halfSize);
        long end = System.currentTimeMillis();
        LOGGER.log(Level.INFO, "Time spent: {0}ms", (end - start));
    }

    private class CalculationTask implements Runnable {
        private double[] array;
        private int startIndex;
        private int size;

        public CalculationTask(double[] array, int startIndex, int size) {
            this.array = array;
            this.startIndex = startIndex;
            this.size = size;
        }

        @Override
        public void run() {
            for (int i = 0; i < size; i++) {
                int index = startIndex + i;
                array[i] = (array[i] * Math.sin(0.2f + index / 5) *
                        Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));

                if (Thread.interrupted()) {
                    return;
                }
            }
        }
    }
}
