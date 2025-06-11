package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsersModel {

    public UsersModel() {
        // Constructor vacío
    }
    
    //	
    public boolean guardarCliente(Connection conn, Cliente cliente) {
        String sql = "INSERT INTO clientes (id_clientes, `nombre_cliente`, telefono, correo) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cliente.getIdClientes());
            stmt.setString(2, cliente.getNombreCliente());
            stmt.setString(3, cliente.getTelefono());
            stmt.setString(4, cliente.getCorreo());

            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    // MODELO PARA OBTENER LOS DATOS DE LOS CLIENTES 
    public List<Cliente> obtenerClientes(Connection conn) {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT id_clientes, nombre_cliente, telefono, correo FROM clientes";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente(
                    rs.getInt("id_clientes"),
                    rs.getString("nombre_cliente"),
                    rs.getString("telefono"),
                    rs.getString("correo")
                );
                lista.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    	// MODELO PARA ACTUALIZAR LOS DATOS DEL CLIENTE:
    public boolean actualizarCliente(Connection conn, Cliente cliente) {
        String sql = "UPDATE clientes SET nombre_cliente = ?, telefono = ?, correo = ? WHERE id_clientes = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombreCliente());
            stmt.setString(2, cliente.getTelefono());
            stmt.setString(3, cliente.getCorreo());
            stmt.setInt(4, cliente.getIdClientes());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    	// MODELO PARA ELIMINAR CLIENTE:
    public boolean eliminarCliente(Connection conn, int idCliente) {
        String sql = "DELETE FROM clientes WHERE id_clientes = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public boolean crearHabitacion(Connection conn, String nombre, int capacidad, String descripcion) {
        String sql = "INSERT INTO habitacion (nombre, capacidad_max, descripcion) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, capacidad);
            stmt.setString(3, descripcion);

            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<Habitacion> obtenerHabitaciones(Connection conn) {
        List<Habitacion> habitaciones = new ArrayList<>();

        String query = "SELECT * FROM habitacion";

        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id_habitacion");
                String nombre = rs.getString("nombre");
                int capacidad = rs.getInt("capacidad_max");
                String descripcion = rs.getString("descripcion");

                Habitacion habitacion = new Habitacion(id, nombre, capacidad, descripcion);
                habitaciones.add(habitacion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return habitaciones;
    }
    
    public boolean eliminarHabitacion(Connection conn, int idHabitacion) {
        String sql = "DELETE FROM habitacion WHERE id_habitacion = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idHabitacion);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public boolean editarHabitacion(Connection conn, int id, String nombre, int capacidad, String descripcion) {
        String sql = "UPDATE habitacion SET nombre = ?, capacidad_max = ?, descripcion = ? WHERE id_habitacion = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, capacidad);
            stmt.setString(3, descripcion);
            stmt.setInt(4, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public boolean crearTarifa(Connection conn, String nombre, double precio, String condicion) {
        String sql = "INSERT INTO tarifa (nombre, precio, condicion) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio);
            pstmt.setString(3, condicion);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public List<Tarifa> obtenerTarifas(Connection conn) {
        List<Tarifa> lista = new ArrayList<>();

        String sql = "SELECT id_tarifa, nombre, precio, condicion FROM tarifa";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Tarifa t = new Tarifa();
                t.setId(rs.getInt("id_tarifa"));
                t.setNombre(rs.getString("nombre"));
                t.setPrecio(rs.getDouble("precio"));
                t.setCondicion(rs.getString("condicion"));
                lista.add(t);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    
    public boolean eliminarTarifa(Connection conn, int idTarifa) {
        String sql = "DELETE FROM tarifa WHERE id_tarifa = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idTarifa);
            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
}



