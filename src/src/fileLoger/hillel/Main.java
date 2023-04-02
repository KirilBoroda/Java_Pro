package fileLoger.hillel;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        FileLogger logger = new FileLogger("C:\\work\\Java_Pro\\src\\src\\fileLoger\\hillel\\logging.properties");
            logger.debug("This is a debug message.");
            logger.info("This is an info message.");

    }
}
