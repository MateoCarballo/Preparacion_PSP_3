package Ejercicio_UDP_Basico;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(1234);
        byte[] recivedBytes = new byte[3000];
        DatagramPacket datagramPacket = new DatagramPacket(recivedBytes, recivedBytes.length);
        System.out.println("Nuevo mensaje:");
        datagramSocket.receive(datagramPacket);

        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));

    }
}
