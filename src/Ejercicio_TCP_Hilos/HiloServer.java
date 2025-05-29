package Ejercicio_TCP_Hilos;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloServer extends Thread{
    private Socket socket;
    private int idCliente;
    private Profesor[] profesores;

    public HiloServer(Socket socket, int idCliente, Profesor[] profesores) {
        this.socket = socket;
        this.idCliente = idCliente;
        this.profesores = profesores;
    }
    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            String idProfesorStr = dis.readUTF();
            int idProfesor = Integer.parseInt(idProfesorStr);

            System.out.println("Completando petición del cliente " + idCliente + " para idProfesor: " + idProfesor);

            Profesor profesor = buscarProfesorPorId(idProfesor);
            oos.writeObject(profesor);

            oos.close();
            dis.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Error en la comunicación con el cliente.");
            e.printStackTrace();
        }
    }

    private Profesor buscarProfesorPorId(int id){
        for (Profesor p: profesores){
            if (p.getIdProfesor() == id){
                return p;
            }
        }
        return new Profesor(-1,"Profesor no encontrado", new Asignatura[0],new Especialidad(0,"ninguna"));
    }
}
