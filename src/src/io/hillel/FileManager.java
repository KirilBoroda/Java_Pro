package io.hillel;

import java.io.*;

public class FileManager {
    private static File currentDirectory = new File(".");


    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print(currentDirectory.getAbsolutePath() + "> ");
            String command;
            try {
                command = reader.readLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }
            String[] commandParts = command.split(" ");
            if (commandParts[0].equals("cd")) {
                if (commandParts.length == 1) {
                    currentDirectory = new File(".");
                } else {
                    String directoryPath = commandParts[1];
                    File directory = new File(directoryPath);
                    if (!directory.isAbsolute()) {
                        directory = new File(currentDirectory, directoryPath);
                    }
                    if (directory.exists() && directory.isDirectory()) {
                        currentDirectory = directory;
                    } else {
                        System.out.println("Error: directory not found.");
                    }
                }
            } else if (commandParts[0].equals("cp")) {
                if (commandParts.length != 3) {
                    System.out.println("Error: invalid command syntax.");
                } else {
                    String sourceFilePath = commandParts[1];
                    String destinationFilePath = commandParts[2];
                    File sourceFile = new File(sourceFilePath);
                    File destinationFile = new File(destinationFilePath);
                    if (!sourceFile.exists()) {
                        System.out.println("Error: source file not found.");
                    } else if (destinationFile.isDirectory()) {
                        destinationFile = new File(destinationFile, sourceFile.getName());
                        copyFile(sourceFile, destinationFile);
                    } else {
                        copyFile(sourceFile, destinationFile);
                    }
                }
            } else if (commandParts[0].equals("ls")) {
                String[] files = currentDirectory.list();
                for (String file : files) {
                    System.out.println(file);
                }
            } else if (commandParts[0].equals("pwd")) {
                System.out.println(currentDirectory.getAbsolutePath());
            } else if (commandParts[0].equals("exit")) {
                break;
            } else {
                System.out.println("Error: command not found.");
            }
        }
    }

    private static void copyFile(File source, File destination) {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
    }
    }
}

