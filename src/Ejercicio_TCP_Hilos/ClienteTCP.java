package Ejercicio_TCP_Hilos;
/*
Crea las siguientes clases con los siguientes atributos, los constructores y los métodos get y
set necesarios:
Clase Asignatura:
int id;
String nombreAsig;
Clase Especialidad:
int id;
String nombreEsp;
Clase Profesor:
int idProfesor;
String nombre;
Asignatura [] asignaturas;
Especialidad esp;
Un profesor podrá impartir hasta 3 asignaturas.
Utilizando sockets TCP, implementar un programa servidor que inicialice un array de 5 objetos
de tipo Profesor. El servidor aceptará conexiones de clientes en un bucle infinito. Cada vez
que se conecte un cliente, el servidor le asignará un id, que empezará en 1 e irá
incrementándose cada vez que se conecta un nuevo cliente. El servidor recibirá del cliente un
idProfesor y le devolverá el objeto Profesor asociado.
Crea un programa cliente en el que se introduzca por teclado el idProfesor que se desea
consultar. Dicho programa recogerá datos hasta recibir un * por parte del usuario.
Si el idProfesor no se encuentra registrado, el servidor le devolverá un objeto Profesor con
datos vacíos
 */

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTCP {
    static final int SERVER_PORT = 9000;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cliente arrancado...");

        System.out.println("Introducir id profesor a consultar");
        String entradaTeclado = sc.nextLine();

        if (entradaTeclado.equalsIgnoreCase("*")) {
            System.out.println("saliendo del cliente");
        }

        Socket socket = new Socket(InetAddress.getLocalHost(), SERVER_PORT);
        DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        System.out.println("String enviada al servidor");
        //Escribir la entrada del teclado
        oos.writeUTF(entradaTeclado);
        oos.flush();
        //Recibir los datos del servidor
        Profesor profesor = (Profesor) ois.readObject();
        System.out.println("Profesor recibido del servidor");
        System.out.println(profesor);
        oos.close();
        ois.close();
        socket.close();

    }
}