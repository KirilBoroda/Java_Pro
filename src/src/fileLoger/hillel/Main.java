package fileLoger.hillel;

public class Main {
    public static void main(String[] args)  {
        FileLoggerConfiguration config = new FileLoggerConfiguration("log.txt", LoggingLevel.DEBUG, 100000, "yyyy-MM-dd HH:mm:ss");
        FileLogger logger = new FileLogger(config);
            logger.debug("This is a debug message.");
            logger.info("This is an info message.");

    }
}
