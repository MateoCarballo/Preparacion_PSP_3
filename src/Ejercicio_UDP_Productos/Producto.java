package Ejercicio_UDP_Productos;

import java.io.Serializable;

public class Producto implements Serializable {
    private int idProducto;
    private double precio;
    private int cantidad;

    public Producto(int idProducto, double precio, int cantidad) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}