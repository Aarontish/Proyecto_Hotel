package Models;

public class Habitacion {
    private int id_habitacion;
    private String nombre;
    private int capacidad_max;
    private String descripcion;

    public Habitacion(int id_habitacion, String nombre, int capacidad_max, String descripcion) {
        this.id_habitacion = id_habitacion;
        this.nombre = nombre;
        this.capacidad_max = capacidad_max;
        this.descripcion = descripcion;
    }

    
    public int getId_habitacion() {
        return id_habitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters (opcional)
    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
