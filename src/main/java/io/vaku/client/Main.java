package io.vaku.client;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter two integers and one of the following operations: [+, -, *, /]");
        System.out.println("Example: 1 + 2");

        try (
                Client client = new Client(new Socket("localhost", 8085));
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String input;
            while ((input = in.readLine()) != null) {
                client.send(input);
                System.out.println(client.read());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
