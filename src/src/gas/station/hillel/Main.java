package gas.station.hillel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        PetrolStation station = new PetrolStation(100);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        try {
            for (int i = 0; i < 9; i++) {
                executorService.execute(() -> {
                    try {
                        station.doRefuel(10);
                    } catch (InterruptedException e) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Refueling process interrupted.", e);
                    }
                });
            }
        } finally {
            executorService.shutdown();
        }
    }
}
