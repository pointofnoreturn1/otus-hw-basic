package io.vaku;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the file name and the sequence you are looking for, separated by a space (e.g. file.txt abc):");
        try (Scanner sc = new Scanner(System.in)) {

            String[] input;
            while ((input = sc.nextLine().split(" ")).length != 2) {
                System.out.println("Invalid input, try again");
            }

            try (FileInputStream fis = new FileInputStream(input[0])) {
                String fileContents = new String(fis.readAllBytes(), StandardCharsets.UTF_8);
                String strToFind = input[1];
                String temp = fileContents.replace(strToFind, "");

                System.out.println((fileContents.length() - temp.length()) / strToFind.length());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
