package io.vaku;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        printTxtFiles();
    }

    private static void printTxtFiles() {
        Set<String> txtFiles = Arrays
                .stream(Objects.requireNonNull(new File(".").listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"))))
                .map(File::getName)
                .collect(Collectors.toSet());

        if (!txtFiles.isEmpty()) {
            System.out.println("List of .txt files:");
            System.out.println(txtFiles);
            System.out.println("Enter a file name to start working with it");
        } else {
            System.out.println("There is no .txt files");
            return;
        }

        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        if (txtFiles.contains(fileName)) {
            printFileContents(fileName);
        } else {
            System.out.println("File with name " + fileName + " doesn't exist");
        }

        System.out.println("Enter text to add to the file");

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            while (true) {
                bos.write(sc.nextLine().getBytes());
                bos.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printFileContents(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
