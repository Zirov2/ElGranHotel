/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elgranhotel.AccesoDatos;

import java.sql.Connection;


public class Habitacion {

    private Connection con=null;
    
    public Habitacion (){}   
    
    int idHabitacion;
    int idCategoria;
    int CantPersonas;
    int cantCamas;
    String tipoCama;
    double precioXnoche;
    boolean estado;

    
    public Habitacion(int idCategoria, int CantPersonas, int cantCamas, String tipoCama, double precioXnoche, boolean estado) {
        this.idCategoria = idCategoria;
        this.CantPersonas = CantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioXnoche = precioXnoche;
        this.estado = estado;
        
    }

    public Habitacion(int idHabitacion, int idCategoria, int CantPersonas, int cantCamas, String tipoCama, double precioXnoche, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idCategoria = idCategoria;
        this.CantPersonas = CantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioXnoche = precioXnoche;
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCantPersonas() {
        return CantPersonas;
    }

    public void setCantPersonas(int CantPersonas) {
        this.CantPersonas = CantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getPrecioXnoche() {
        return precioXnoche;
    }

    public void setPrecioXnoche(double precioXnoche) {
        this.precioXnoche = precioXnoche;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "con=" + con + ", idHabitacion=" + idHabitacion + ", idCategoria=" + idCategoria + ", CantPersonas=" + CantPersonas + ", cantCamas=" + cantCamas + ", tipoCama=" + tipoCama + ", precioXnoche=" + precioXnoche + ", estado=" + estado + '}';
    }

}

    
