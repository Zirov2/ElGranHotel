/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elgranhotel.AccesoDatos;

import elgranhotel.Entidades.abmHuesped;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class HuespedData {

    private Connection con=null;
    
    public HuespedData (){
        
        con= Conexion.getConexion();
    }
    public void guardarHuesped(abmHuesped huesped){
        String sql="INSERT INTO huesped (nombre,dni,domicilio,correo,celular)"
                + "VALUES(? ,? ,? ,? ,? )";
                
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,huesped.getNombre());
            ps.setInt(2,huesped.getDni());
            ps.setString(3,huesped.getDomicilio());
            ps.setString(4,huesped.getCorreo());
            ps.setInt(5,huesped.getCelular());
           
            
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Huesped grabado correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla huesped");
        }
    
}
    
   public void modificarHuesped(abmHuesped huesped) {
    String sql = "UPDATE huesped SET nombre=?, dni=?, domicilio=?, correo=?, celular=? "
            + "WHERE idHuesped=?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, huesped.getNombre());
        ps.setInt(2, huesped.getDni());
        ps.setString(3, huesped.getDomicilio());
        ps.setString(4, huesped.getCorreo());
        ps.setInt(5, huesped.getCelular());
        ps.setInt(6, huesped.getIdHuesped()); // Agregado para saber el idHuesped
        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Huesped Modificado");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped para modificar");
    }
}

    
  /*  public void eliminarHuesped (int idHuesped){
        
        String sql="UPDATE huesped SET estado= 0 WHERE idHuesped=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            int exito = ps.executeUpdate();
            if (exito==1 ){
                JOptionPane.showMessageDialog(null, "Huesped Eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla huesped para eliminar" );
        }
        
    }*/
    
    public abmHuesped buscarHuespedDni(int dni) {
   abmHuesped huesped = null;
   String sql = "SELECT * FROM huesped WHERE dni = ?";
   
   try {
   PreparedStatement ps = con.prepareStatement(sql);
   ps.setInt(1, dni);
   ResultSet rs = ps.executeQuery();
   if (rs.next()) {
   huesped = new abmHuesped();
   huesped.setIdHuesped(rs.getInt("idHuesped")); // Agregado para establecer el valor del idHuesped
   huesped.setNombre(rs.getString("nombre"));
   huesped.setDni(rs.getInt("dni"));
   huesped.setDomicilio(rs.getString("domicilio"));
   huesped.setCorreo(rs.getString("correo"));
   huesped.setCelular(rs.getInt("celular"));
   
   
   } else {
   JOptionPane.showMessageDialog(null, "No existe el Huesped ");
   ps.close();
   }
   
   } catch (SQLException ex) {
   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped x BUSCAR ");
   }
   return huesped;
   }


   
} // FINAL
