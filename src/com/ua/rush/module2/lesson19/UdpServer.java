package com.ua.rush.module2.lesson19;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9000);
        System.out.println("Udp server started");

        byte[] buffer = new byte[1024];
        for (int i = 0; i < 3; i++) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(packet);

            String line = new String(packet.getData(), 0, packet.getLength());
            System.out.println(line);
        }

        datagramSocket.close();
    }
}
