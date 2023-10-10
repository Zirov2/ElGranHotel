/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

import elgranhotel.AccesoDatos.Conexion;
import elgranhotel.AccesoDatos.Habitacion;
import elgranhotel.AccesoDatos.HuespedData;
import elgranhotel.Entidades.abmHabitacion;
import elgranhotel.Entidades.abmHuesped;
import java.sql.Connection;
/**
 *
 * @author Octavio
 */
public class ElGranHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Connection con = Conexion.getConexion();
//        abmHuesped Horacio = new abmHuesped(1, "Horacio", 34548774, "Pueyrredon 1585", "horacio@hotmail.com", 1545168577);
//        abmHuesped Gab = new abmHuesped(1, "Gabriel", 34548784, "Santana 666", "drCadilac@hotmail.com", 1545168987);
//        abmHuesped Magi = new abmHuesped(1, "Maggi", 32348784, "calle falsa 123", "Simpsons03@hotmail.com", 1545198987);
        HuespedData hues = new HuespedData();
//
//           hues.guardarHuesped(Horacio);
//           hues.guardarHuesped(Gab);
           //hues.guardarHuesped(Magi);
//        
        // abmHuesped HuesBuscar = new abmHuesped();
        
        /* hues.modificarHuesped(Horacio);
        System.out.println("domicilio "+ Horacio.getDomicilio());
         */
        
        /*  abmHuesped huespedEncontrado = hues.buscarHuespedDni(34548774);
        System.out.println("dni " +huespedEncontrado.getDni());
        System.out.println("nombre " +huespedEncontrado.getNombre());
        System.out.println("domicilio "+huespedEncontrado.getDomicilio());
        System.out.println("celular " +huespedEncontrado.getCelular());
         */
        
       
       hues.eliminarHuesped(5);
         
    }
}

        
        
        
        
        
        
        
        
        
        
       /* abmHabitacion habi= new abmHabitacion();
        for (Habitacion habitacion: habi.ListaHabitacion()){
            System.out.println("Categoria "+habitacion.getIdCategoria());
            System.out.println("cantPersonas "+habitacion.getCantPersonas());
            System.out.println("cantCamas "+habitacion.getCantCamas());
            System.out.println("Precio por Noche "+habitacion.getPrecioXnoche());
            System.out.println("000000000");
        }
        
        
        
        
        
        
        
        
        
        */
//       Habitacion habi = new Habitacion(2,3,2,"HOLA",5,true);
//       abmHabitacion nuevaH = new abmHabitacion();
//       nuevaH.guardarHabitacion(habi);
       
        
    
       
       
       
       
       
       /*  Habitacion nuevaHabitacion = new Habitacion();
    nuevaHabitacion.setIdCategoria(1); // Reemplaza con el valor correcto.
    nuevaHabitacion.setCantPersonas(2); // Reemplaza con el valor correcto.
    nuevaHabitacion.setCantCamas(1); // Reemplaza con el valor correcto.
    nuevaHabitacion.setTipoCama("Cama Doble"); // Reemplaza con el valor correcto.
    nuevaHabitacion.setPrecioXnoche(100.0); // Reemplaza con el valor correcto.
    
    nuevaHabitacion.guardarHabitacion(nuevaHabitacion);*/
        

  