package Models;

public class TarifaModel {
    private int idTarifa;
    private String nombre;
    private String descripcion;
    private String condicion;
    private double precio;

    // Constructor con todos los campos
    public TarifaModel(int idTarifa, String nombre, double precio, String condicion, String descripcion) {
        this.idTarifa = idTarifa;
        this.nombre = nombre;
        this.precio = precio;
        this.condicion = condicion;
        this.descripcion = descripcion;
    }

    // Constructor alternativo sin descripción (opcional)
    public TarifaModel(int idTarifa, String nombre, double precio, String condicion) {
        this(idTarifa, nombre, precio, condicion, "");
    }

    // Getters y Setters
    public int getIdTarifa() {
        return idTarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCondicion() {
        return condicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
