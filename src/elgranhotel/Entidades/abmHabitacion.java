/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elgranhotel.Entidades;

import elgranhotel.AccesoDatos.Conexion;
import elgranhotel.AccesoDatos.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class abmHabitacion {

    private Connection con=null;
    
    public abmHabitacion (){
    con= Conexion.getConexion();
    
    }
    
    public void guardarHabitacion(Habitacion habitacion) {
        String sql = "INSERT INTO habitacion (idCategoria,cantPersonas,cantCamas,tipoCama,precioXnoche,estado)"
                + "VALUES(? ,? ,? ,? ,?,? )";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getIdCategoria());
            ps.setInt(2, habitacion.getCantPersonas());
            ps.setInt(3, habitacion.getCantCamas());
            ps.setString(4, habitacion.getTipoCama());
            ps.setDouble(5, habitacion.getPrecioXnoche());
            ps.setBoolean(6, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitacion grabada correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion para Agregar");
        }
    }
        
    public List<Habitacion> ListaHabitacion(){
        String sql= "SELECT idHabitacion,idCategoria,cantPersonas,cantCamas,tipoCama,precioXnoche FROM habitacion WHERE estado=1";
        
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                
                Habitacion  hab = new Habitacion();
                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setIdCategoria(rs.getInt("idCategoria"));
                hab.setCantPersonas(rs.getInt("cantPersonas"));
                hab.setCantCamas(rs.getInt("cantCamas"));
                hab.setTipoCama(rs.getString("tipoCama"));
                hab.setPrecioXnoche(rs.getDouble("precioXnoche"));
                hab.setEstado(true);
                habitaciones.add(hab);
                
            }
                        ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR AL ACCEDER TABLA HABITACION PARA LISTAR");
        }
        return habitaciones;
    }
    
    
    
}
