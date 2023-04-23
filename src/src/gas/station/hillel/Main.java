package gas.station.hillel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        PetrolStation station = new PetrolStation(100);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 9; i++) {
            executorService.execute(() -> {
                try {
                    station.doRefuel(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}
