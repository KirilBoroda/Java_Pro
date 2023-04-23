package gas.station.hillel;


import java.util.concurrent.Semaphore;

public class PetrolStation {
    private int amount;
    private final Semaphore semaphore;

    public PetrolStation(int amount) {
        this.amount = amount;
        this.semaphore = new Semaphore(3, true);
    }

    public void doRefuel(int requestedAmount) throws InterruptedException {
        semaphore.acquire();
        System.out.printf("Thread %s is refueling...%n", Thread.currentThread().getName());
        Thread.sleep((int) (Math.random() * 8000) + 3000);
        synchronized (this) {
            if (amount < requestedAmount) {
                System.out.printf("Thread %s: not enough petrol available, requested %d but only %d available.%n",
                        Thread.currentThread().getName(), requestedAmount, amount);
            } else {
                amount -= requestedAmount;
                System.out.printf("Thread %s: refueled %d petrol units. %d petrol units left.%n",
                        Thread.currentThread().getName(), requestedAmount, amount);
            }
        }
        semaphore.release();
    }

    public int getAmount() {
        return amount;
    }
}
