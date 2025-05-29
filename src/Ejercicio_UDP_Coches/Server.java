package Ejercicio_UDP_Coches;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DatagramSocket datagramSocket = new DatagramSocket(1234);
        byte[] receivedCarAsBytes = new byte[5000];
        DatagramPacket datagramPacket = new DatagramPacket(receivedCarAsBytes, receivedCarAsBytes.length);

        datagramSocket.receive(datagramPacket);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(datagramPacket.getData());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        Coche recivedCar = (Coche) objectInputStream.readObject();
        System.out.println(recivedCar);
    }
}
