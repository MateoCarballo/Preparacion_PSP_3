package Ejercicio_TCP_Hilos;

import java.io.Serializable;
/*
Clase Asignatura:
int id;
String nombreAsig;
 */
public class Asignatura implements Serializable {
    private int id;
    private String nombreAsig;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public Asignatura(int id, String nombreAsig) {

        this.id = id;
        this.nombreAsig = nombreAsig;
    }
}
