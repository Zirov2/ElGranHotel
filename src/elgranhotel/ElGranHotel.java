/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

import elgranhotel.AccesoDatos.Conexion;
import elgranhotel.AccesoDatos.HuespedData;
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
        abmHuesped Horacio = new abmHuesped(1, "Horacio", 34548774, "Pueyrredon 1585", "horacio@hotmail.com", 1545168577);
        HuespedData hues = new HuespedData();

        //   hues.guardarHuesped(Horacio);
        
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
        
        
    }

}
    