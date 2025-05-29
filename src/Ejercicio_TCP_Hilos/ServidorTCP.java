package Ejercicio_TCP_Hilos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final int PORT = 9000;
        int idCliente = 0;
        Profesor[] profesores = crearArrayProfesores();

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor arrancado en el puerto " + PORT);

            while (true) {
                Socket clienteSocket = serverSocket.accept();
//            ***ESTO NO ES NECESARIO SI SE LO VAMOS A PASAR A UN HILO.LE PASAREMOS AL HILO EL SOCKET DIRECTAMENTE ***
//                DataInputStream dis = new DataInputStream(clienteSocket.getInputStream());
//                ObjectOutputStream oos = new ObjectOutputStream(clienteSocket.getOutputStream());

                System.out.println("Petición recibida del cliente: " + idCliente);

                idCliente++;
                System.out.println("Peticion registrada...");
                HiloServer hilo = new HiloServer(clienteSocket, idCliente, profesores);
                hilo.start();
            }
        }
    }

    public static Profesor[] crearArrayProfesores() {
        // Crear asignaturas de segundo DAM
        Asignatura ad = new Asignatura(1, "Acceso a Datos");
        Asignatura di = new Asignatura(2, "Desarrollo de Interfaces");
        Asignatura pm = new Asignatura(3, "Programación Multimedia y Dispositivos Móviles");
        Asignatura sp = new Asignatura(4, "Servicios y Procesos");
        Asignatura eie = new Asignatura(5, "Empresa e Iniciativa Emprendedora");
        Asignatura proyecto = new Asignatura(6, "Proyecto DAM");

        // Especialidades
        Especialidad prog = new Especialidad(1, "Programación");
        Especialidad bd = new Especialidad(2, "Bases de Datos");
        Especialidad entornos = new Especialidad(3, "Entornos de Desarrollo");
        Especialidad gestion = new Especialidad(4, "Gestión Empresarial");

        // Crear profesores
        Profesor[] profesores = new Profesor[5];
        profesores[0] = new Profesor(1, "Laura Martínez", new Asignatura[]{ad, sp}, bd);
        profesores[1] = new Profesor(2, "Carlos Pérez", new Asignatura[]{di, pm}, prog);
        profesores[2] = new Profesor(3, "Marta Sánchez", new Asignatura[]{eie}, gestion);
        profesores[3] = new Profesor(4, "Antonio Gómez", new Asignatura[]{proyecto, sp}, entornos);
        profesores[4] = new Profesor(5, "Elena Ruiz", new Asignatura[]{ad, proyecto}, bd);

        return profesores;
    }
}
