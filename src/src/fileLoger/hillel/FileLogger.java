package fileLoger.hillel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
    private FileLoggerConfiguration config;

    public FileLogger(String fileName) throws IOException {
        this.config = FileLoggerConfigurationLoader.load(fileName);
    }

    public void debug(String message) {
        if (config.getLevel().compareTo(LoggingLevel.DEBUG) >= 0) {
            log("DEBUG", message);
        }
    }

    public void info(String message) {
        if (config.getLevel().compareTo(LoggingLevel.INFO) >= 0) {
            log("INFO", message);
        }
    }


    private void log(String level, String message) {
        File file = new File(config.getFile());
        long fileSize = file.length();
        long maxFileSize = config.getMaxFileSize();
        if (fileSize >= maxFileSize) {
            String fileName = generateNewFileName(config.getFile());
            file = new File(fileName);
        }
        String logEntry = "[" + getCurrentTime() + "][" + level + "] Message: " + message;
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(logEntry + "\n");
        } catch (IOException e) {
            throw new RuntimeException("An error occurred while writing to the log file.", e);
        }
    }

    private String generateNewFileName(String file) {
        String fileName1 = "log";
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy;MM;dd;HH;mm;ss"));
        String format = ".txt";
        return fileName1 + date + format;

    }

    private String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(config.getFormat());
        return now.format(formatter);
    }
}