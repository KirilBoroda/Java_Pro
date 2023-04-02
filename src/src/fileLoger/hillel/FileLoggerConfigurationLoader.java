package fileLoger.hillel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public static FileLoggerConfiguration load(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        String file = null;
        LoggingLevel level = null;
        long maxFileSize = 0;
        String format = null;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("=");
            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid configuration line: " + line);
            }
            String key = parts[0].trim();
            String value = parts[1].trim();
            switch (key) {
                case "file":
                    file = value;
                    break;
                case "level":
                    level = LoggingLevel.valueOf(value.toUpperCase());
                    break;
                case "maxFileSize":
                    maxFileSize = Long.parseLong(value);
                    break;
                case "format":
                    format = value;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown configuration key: " + key);
            }
        }
        reader.close();
        return new FileLoggerConfiguration(file, level, maxFileSize, format);
    }
}
