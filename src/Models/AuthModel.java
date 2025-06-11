package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthModel {
    private Connection connection;
    
    // INICIO DE SESION:
    public AuthModel(Connection connection) {
        this.connection = connection;
    }

    public boolean login(String nombre_usuario, String contraseña) {
        String sql = "SELECT * FROM admin WHERE nombre_usuario = ? AND contraseña = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nombre_usuario);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.err.println("Error al iniciar sesión: " + e.getMessage());
            return false;
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) connection.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    
    //modelo de registro:
	public boolean registrar(String nombreUsuario, String contrasena) {
		
	    String checkSql = "SELECT COUNT(*) FROM admin WHERE nombre_usuario = ?";
	    try (PreparedStatement checkStmt = connection.prepareStatement(checkSql)) {
	        checkStmt.setString(1, nombreUsuario);
	        ResultSet rs = checkStmt.executeQuery();
	        if (rs.next() && rs.getInt(1) > 0) {
	            return false; 
	        }
	    } catch (SQLException e) {
	        System.err.println("Error al verificar duplicado: " + e.getMessage());
	        return false;
	    }
	
	    String insertSql = "INSERT INTO admin (nombre_usuario, contraseña) VALUES (?, ?)";
	    try (PreparedStatement stmt = connection.prepareStatement(insertSql)) {
	        stmt.setString(1, nombreUsuario);
	        stmt.setString(2, contrasena);
	        int rowsInserted = stmt.executeUpdate();
	        return rowsInserted > 0;
	    } catch (SQLException e) {
	        System.err.println("❌ Error al registrar usuario: " + e.getMessage());
	        return false;
	    }
	}
}
