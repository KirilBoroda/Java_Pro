package hilell.hw;

import java.io.IOException;
import java.nio.file.*;


public class FileManager {
    private static Path currentDirectory;

    public static void main(String[] args) {
        currentDirectory = Paths.get("C:\\work\\Java_Pro");

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
                    System.out.println("Usage: cd <directory>");
                }
                break;
            case "cp":
                if (parts.length > 2) {
                    copyFile(parts[1], parts[2]);
                } else {
                    System.out.println("Usage: cp <source> <destination>");
                }
                break;
            case "ls":
                listFiles();
                break;
            case "pwd":
                printWorkingDirectory();
                break;
            default:
                System.out.println("Unknown command: " + parts[0]);
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
            System.out.println("Directory not found: " + directory);
        }
    }

    private static void copyFile(String source, String destination) {
        Path sourcePath = currentDirectory.resolve(source);
        Path destinationPath = currentDirectory.resolve(destination);

        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listFiles() {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentDirectory)) {
            for (Path file : stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printWorkingDirectory() {
        System.out.println(currentDirectory.toAbsolutePath());
    }
}
