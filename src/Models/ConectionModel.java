package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionModel {
    private static final String URL = "jdbc:mysql://pro.freedb.tech:3306/Hotel"; //  URL y base de datos
    private static final String USER = "Poketish";//  usuario
    private static final String PASSWORD = "?bgj@&*JEmSn&s7"; //contraseña

    private Connection connection;

    public ConectionModel() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("❌ Error al conectar a la base de datos:");
            e.printStackTrace(); 
        }
    }


    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}