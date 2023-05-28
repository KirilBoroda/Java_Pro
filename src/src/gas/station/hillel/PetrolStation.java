package gas.station.hillel;


import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PetrolStation {
    private int amount;
    private final Semaphore semaphore;
    private static final Logger LOGGER = Logger.getLogger(PetrolStation.class.getName());

    public PetrolStation(int amount) {
        this.amount = amount;
        this.semaphore = new Semaphore(3, true);
    }

    public void doRefuel(int requestedAmount) throws InterruptedException {
        semaphore.acquire();
        LOGGER.log(Level.INFO, "Thread {0} is refueling...", Thread.currentThread().getName());
        try {
            Thread.sleep((int) (Math.random() * 8000) + 3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.log(Level.WARNING, "Refueling process interrupted.", e);
            return;
        }
        synchronized (this) {
            try {
                if (amount < requestedAmount) {
                    LOGGER.log(Level.INFO, "Thread {0}: not enough petrol available, requested {1} but only {2} available.",
                            new Object[]{Thread.currentThread().getName(), requestedAmount, amount});
                } else {
                    amount -= requestedAmount;
                    LOGGER.log(Level.INFO, "Thread {0}: refueled {1} petrol units. {2} petrol units left.",
                            new Object[]{Thread.currentThread().getName(), requestedAmount, amount});
                }
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "An error occurred during refueling.", e);
            }
        }
        semaphore.release();
    }
}
