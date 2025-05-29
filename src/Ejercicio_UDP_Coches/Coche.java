package Ejercicio_UDP_Coches;

import java.io.Serializable;

public class Coche implements Serializable {
    private String modelo;
    private String matricula;
    private int km;

    public Coche(String modelo, String matricula, int km) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.km = km;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return String.format(
                "🚗 Coche: %s\n" +
                        "   ├── Matrícula: %s\n" +
                        "   └── Kilometraje: %,d km", // The '%,d' adds a comma for thousands separator
                modelo,
                matricula,
                km
        );
    }
}
