package fileLoger.hillel;

public class Main {
    public static void main(String[] args) {
        FileLoggerConfiguration config = new FileLoggerConfiguration("log.txt", LoggingLevel.DEBUG, 1, "yyyy-MM-dd HH:mm:ss");
        FileLogger logger = new FileLogger(config);

        try {
            logger.debug("This is a debug message.");
            logger.info("This is an info message.");
        } catch (FileMaxSizeReachedException e) {
            System.out.println(e.getMessage());
        }
    }
}
