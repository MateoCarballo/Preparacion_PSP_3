package Ejercicio_UDP_Basico;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int port = 1234;
        DatagramSocket client = new DatagramSocket();

        System.out.println("Escribe un nuevo mensaje");
        byte[] entradaTecladoAsArrayOfBytes = sc.nextLine().getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(
                entradaTecladoAsArrayOfBytes,
                entradaTecladoAsArrayOfBytes.length,
                InetAddress.getLocalHost(), port);

        client.send(datagramPacket);

    }
}
