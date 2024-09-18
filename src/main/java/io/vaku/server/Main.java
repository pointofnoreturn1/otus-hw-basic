package io.vaku.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try (
                ServerSocket serverSocket = new ServerSocket(8085);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String input;
            while ((input = in.readLine()) != null) {
                out.println(handleOperation(input));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String handleOperation(String input) {
        String[] args = input.split(" ");
        if (args.length != 3) {
            return "Invalid number of arguments";
        }

        int a, b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            return "Can't parse integers";
        }

        return switch (args[1]) {
            case "+" -> a + b + "";
            case "-" -> a - b + "";
            case "*" -> a * b + "";
            case "/" -> a / b + "";
            default -> "Unsupported operation";
        };
    }
}
