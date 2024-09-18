package io.vaku.client;

import java.io.*;
import java.net.Socket;

public class Client implements AutoCloseable {
    private final BufferedReader in;
    private final PrintWriter out;

    public Client(Socket socket) throws IOException {
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new PrintWriter(socket.getOutputStream(), true);
    }

    public void send(String input) {
        out.println(input);
    }

    public String read() throws IOException {
        return in.readLine();
    }

    @Override
    public void close() throws Exception {
        in.close();
        out.close();
    }
}
