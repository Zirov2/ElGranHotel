/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elgranhotel.AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

      private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="elgranhotel";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){}

    // Constructor privado para evitar instanciación externa
   

    // Método para obtener una conexión a la base de datos
    public static Connection getConexion() {
        if (connection == null) {
            try {
                // Cargar el controlador de MySQL (Driver)
                Class.forName("org.mariadb.jdbc.Driver");

                // Establecer la conexión a la base de datos
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null,"Conectado");
            } catch (ClassNotFoundException ex) {
                // Si no se puede cargar el controlador
                JOptionPane.showMessageDialog(null, "Error al cargar el driver: " + ex.getMessage());
            } catch (SQLException ex) {
                // Si hay un error de SQL al conectarse a la base de datos
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos: " + ex.getMessage());
            }
        }
        return connection; 
    }
}
