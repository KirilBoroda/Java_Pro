package hilell.hw;

import java.io.IOException;
import java.nio.file.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
    private static final Logger logger = Logger.getLogger(FileManager.class.getName());
    private static Path currentDirectory;

    public static void main(String[] args) {
        currentDirectory = Paths.get("user.home");

        while (true) {
            String command = getUserInput();
            executeCommand(command);
        }
    }

    private static String getUserInput() {
        byte[] inputBytes = new byte[1024];
        int bytesRead;

        try {
            bytesRead = System.in.read(inputBytes);
        } catch (IOException e) {
            throw new RuntimeException("Error reading user input", e);
        }

        if (bytesRead <= 0) {
            throw new RuntimeException("No input received");
        }

        String input = new String(inputBytes, 0, bytesRead);
        return input.trim();
    }

    private static void executeCommand(String command) {
        String[] parts = command.trim().split("\\s+");

        switch (parts[0]) {
            case "cd":
                if (parts.length > 1) {
                    changeDirectory(parts[1]);
                } else {
                    logger.log(Level.INFO, "Usage: cd <directory>");
                }
                break;
            case "cp":
                if (parts.length > 2) {
                    copyFile(parts[1], parts[2]);
                } else {
                    logger.log(Level.INFO, "Usage: cp <source> <destination>");
                }
                break;
            case "ls":
                listFiles();
                break;
            case "pwd":
                printWorkingDirectory();
                break;
            default:
                logger.log(Level.INFO, "Unknown command: " + parts[0]);
                break;
        }
    }

    private static void changeDirectory(String directory) {
        Path newDirectory;

        if (directory.startsWith("/")) {
            newDirectory = Paths.get(directory);
        } else {
            newDirectory = currentDirectory.resolve(directory);
        }

        if (Files.isDirectory(newDirectory)) {
            currentDirectory = newDirectory;
        } else {
            logger.log(Level.INFO, "Directory not found: " + directory);
        }
    }

    private static void copyFile(String source, String destination) {
        Path sourcePath = currentDirectory.resolve(source);
        Path destinationPath = currentDirectory.resolve(destination);

        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            logger.log(Level.INFO, "File copied successfully");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error copying file", e);
        }
    }

    private static void listFiles() {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentDirectory)) {
            for (Path file : stream) {
                logger.log(Level.INFO, file.getFileName().toString());
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error listing files", e);
        }
    }

    private static void printWorkingDirectory() {
        logger.log(Level.INFO, currentDirectory.toAbsolutePath().toString());
    }
}
