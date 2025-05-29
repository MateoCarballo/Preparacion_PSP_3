package Ejercicio_UDP_Productos;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Random;

public class ServidorProducto {
    private static Producto[] productos;

    public static void main(String[] args) throws SocketException {
        productos = crearListaDe10ProductosConIDsConsecutivos();
        int puertoServidor = 9876;
        byte[] entradaDatos = new byte[1024];

        try (DatagramSocket datagramSocketServidor = new DatagramSocket(puertoServidor)) {
            while (true) {
                DatagramPacket datagramPacket = new DatagramPacket(entradaDatos, entradaDatos.length);
                datagramSocketServidor.receive(datagramPacket);

                ByteArrayInputStream bis = new ByteArrayInputStream(datagramPacket.getData());
                DataInputStream dis = new DataInputStream(bis);

                int idProducto = dis.readInt();

                Producto p = buscarProducto(idProducto);
                double resultado = -1;
                if (p != null) {
                    resultado = p.getCantidad() * p.getPrecio();
                }

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(baos);

                dos.writeDouble(resultado);

                byte[] datosParaEnviar = baos.toByteArray();

                DatagramPacket datagramPacketEnviar = new DatagramPacket(datosParaEnviar, datosParaEnviar.length, InetAddress.getLocalHost(), 1234);
                datagramSocketServidor.send(datagramPacketEnviar);
            }
        } catch (IOException e) {
            System.out.println("Error en la entrada saldia datos");
            e.printStackTrace();
        }
    }

    private static Producto buscarProducto(int idProducto) {
        Producto product = null;
        for (Producto p : productos) {
            if (p.getIdProducto() == idProducto) product = p;
        }
        return product;
    }

    public static Producto[] crearListaDe10ProductosConIDsConsecutivos() {
        Producto[] productos = new Producto[10];
        Random random = new Random(); // Para las cantidades y variaciones de precio

        for (int i = 0; i < 10; i++) {
            // Generamos precios diferentes y con decimales
            double precioBase = 15.0 + (i * 3.75); // Precios base que se incrementan
            // Añadimos una pequeña variación aleatoria y redondeamos a 2 decimales
            double precioFinal = Math.round((precioBase + (random.nextDouble() * 2.0)) * 100.0) / 100.0;

            // Cantidad aleatoria entre 1 y 50
            int cantidad = 1 + random.nextInt(50);

            productos[i] = new Producto(i + 1, precioFinal, cantidad);
        }

        return productos;
    }
}
