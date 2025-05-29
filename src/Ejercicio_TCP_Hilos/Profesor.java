package Ejercicio_TCP_Hilos;

import java.io.Serializable;
/*
Clase Profesor:
int idProfesor;
String nombre;
Asignatura [] asignaturas;
Especialidad esp;
 */
public class Profesor implements Serializable {
    private int idProfesor;
    private String nombre;
    private Asignatura[] asignaturas;
    private Especialidad especialidad;

    public Profesor(int idProfesor, String nombre, Asignatura[] asignaturas, Especialidad especialidad) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.especialidad = especialidad;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("══════════════════════════════════════════════\n");
        sb.append("👨‍🏫 PROFESOR: ").append(nombre).append(" (ID: ").append(idProfesor).append(")\n");
        sb.append("📚 Especialidad: ").append(especialidad != null ? especialidad.getNombreEsp() : "No asignada").append("\n");
        sb.append("📘 Asignaturas que imparte:\n");

        if (asignaturas != null && asignaturas.length > 0) {
            for (int i = 0; i < asignaturas.length; i++) {
                sb.append("   ").append(i + 1).append(". ").append(asignaturas[i].getNombreAsig()).append(" (ID: ").append(asignaturas[i].getId()).append(")\n");
            }
        } else {
            sb.append("   ⚠️ No tiene asignaturas asignadas.\n");
        }

        sb.append("══════════════════════════════════════════════\n");
        return sb.toString();
    }

}
