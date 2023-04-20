package threads.hillel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValueCalculator {

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

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < halfSize; i++) {
                    int index = i;
                    a1[index] = (a1[index] * Math.sin(0.2f + index / 5) *
                            Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < halfSize; i++) {
                    int index = i;
                    a2[index] = (a2[index] * Math.sin(0.2f + (index + halfSize) / 5) *
                            Math.cos(0.2f + (index + halfSize) / 5) * Math.cos(0.4f + (index + halfSize) / 2));
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, halfSize);
        System.arraycopy(a2, 0, arr, halfSize, halfSize);
        long end = System.currentTimeMillis();
        System.out.println("Time spent: " + (end - start) + "ms");
    }

    @Override
    public String toString() {
        return "ValueCalculator{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", halfSize=" + halfSize +
                '}';
    }
}
