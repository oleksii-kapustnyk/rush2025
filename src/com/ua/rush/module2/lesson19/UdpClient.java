package com.ua.rush.module2.lesson19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpClient {

    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] data = "Hello from client".getBytes();
        byte[] data2 = "Hello 2 from client".getBytes();
        byte[] data3 = "Hello 3 from client".getBytes();
        InetAddress inetAddress = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(data, data.length, inetAddress, 9000);
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length, inetAddress, 9000);
        DatagramPacket packet3 = new DatagramPacket(data3, data3.length, inetAddress, 9000);
        datagramSocket.send(packet);
        datagramSocket.send(packet2);
        datagramSocket.send(packet3);
        datagramSocket.close();


    }


}
