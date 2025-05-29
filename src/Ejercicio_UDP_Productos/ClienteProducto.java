package Ejercicio_UDP_Productos;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class ClienteProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puertoCliente = 1234;
        byte[] infoRecibida = new byte[1024];

        try(DatagramSocket datagramSocketCliente = new DatagramSocket(puertoCliente)){
            while(true){
                System.out.println("Escribe el id del producto que vas a enviar");
                int idProducto = Integer.parseInt(scanner.nextLine());

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(baos);

                dos.writeInt(idProducto);
                dos.flush();

                byte[] infoParaEnviar = baos.toByteArray();

                DatagramPacket paqueteParaEnviar = new DatagramPacket(
                        infoParaEnviar,
                        infoParaEnviar.length,
                        InetAddress.getLocalHost(),
                        9876);

                datagramSocketCliente.send(paqueteParaEnviar);

                DatagramPacket paqueteInfoRecibida = new DatagramPacket(infoRecibida,infoRecibida.length);
                datagramSocketCliente.receive(paqueteInfoRecibida);

                ByteArrayInputStream bais = new ByteArrayInputStream(infoRecibida,0, infoRecibida.length);
                DataInputStream dis = new DataInputStream(bais);

                double precioTotal =  dis.readDouble();
                System.out.println("El precio total es de " + precioTotal);
            }
        } catch (SocketException e) {
            System.out.println("Error socket");
        } catch (IOException e) {
            System.out.println("Error de parseo del entero");
        }
    }
}
