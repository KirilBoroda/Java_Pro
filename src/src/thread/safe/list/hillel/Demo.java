package thread.safe.list.hillel;

import thread.safe.list.hillel.ThreadSafeList;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        ThreadSafeList<Integer> list = new ThreadSafeList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.execute(() -> {
                System.out.println("Thread " + Thread.currentThread().getName() + ": " + list.get(index));
                list.remove(index);
            });
        }

        executorService.shutdown();
    }
}
