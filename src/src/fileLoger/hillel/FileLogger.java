package fileLoger.hillel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
    private FileLoggerConfiguration config;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    public void debug(String message) throws FileMaxSizeReachedException {
        if (config.getLevel().compareTo(LoggingLevel.DEBUG) >= 0) {
            log("DEBUG", message);
        }
    }

    public void info(String message) throws FileMaxSizeReachedException {
        if (config.getLevel().compareTo(LoggingLevel.INFO) >= 0) {
            log("INFO", message);
        }
    }


    private void log(String level, String message) throws FileMaxSizeReachedException {
        File file = new File(config.getFile());
        long fileSize = file.length();
        long maxFileSize = config.getMaxFileSize();
        if (fileSize >= maxFileSize) {
            throw new FileMaxSizeReachedException("Maximum file size reached. " +
                    "Max size: " + maxFileSize + " bytes. " +
                    "Current size: " + fileSize + " bytes. " +
                    "Path: " + config.getFile());
        }
        String logEntry = "[" + getCurrentTime() + "][" + level + "] Message: " + message;
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(logEntry + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the log file.");
            e.printStackTrace();
        }
    }

    private String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}