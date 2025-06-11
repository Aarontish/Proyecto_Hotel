package Models;

public class Cliente {
    private int idClientes;
    private String nombreCliente;
    private String telefono;
    private String correo;

    // Constructor
    public Cliente(int idClientes, String nombreCliente, String telefono, String correo) {
        this.idClientes = idClientes;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters
    public int getIdClientes() {
        return idClientes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
}
