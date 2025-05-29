package Ejercicio_UDP_Coches;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        Coche coche = new Coche("3008", "9881MPN", 15000);
        DatagramSocket datagramSocket = new DatagramSocket();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        objectOutputStream.writeObject(coche);

        byte[] objectAsBytes = byteArrayOutputStream.toByteArray();
        DatagramPacket datagramPacket = new DatagramPacket(objectAsBytes, objectAsBytes.length, InetAddress.getLocalHost(), 1234);
        datagramSocket.send(datagramPacket);
    }
}
