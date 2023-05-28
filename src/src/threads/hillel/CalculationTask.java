package threads.hillel;

 class CalculationTask implements Runnable {
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
        }
    }
}