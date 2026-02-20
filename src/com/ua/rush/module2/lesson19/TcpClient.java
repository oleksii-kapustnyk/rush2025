package com.ua.rush.module2.lesson19;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9000);

        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("Hello from client");
        writer.flush();

        socket.close();
    }
}
