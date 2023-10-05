/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elgranhotel.Entidades;

public class abmHuesped {

    int idHuesped;
    String nombre;
    int dni;
    String Domicilio;
    String Correo;
    int Celular;

    public abmHuesped() {
    }

    public abmHuesped(String nombre, int dni, String Domicilio, String Correo, int Celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.Domicilio = Domicilio;
        this.Correo = Correo;
        this.Celular = Celular;

    }

    public abmHuesped(int idHuesped, String nombre, int dni, String Domicilio, String Correo, int Celular) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.dni = dni;
        this.Domicilio = Domicilio;
        this.Correo = Correo;
        this.Celular = Celular;

    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    @Override
    public String toString() {
        return "abmHuesped{" + "idHuesped=" + idHuesped + ", nombre=" + nombre + ", dni=" + dni + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Celular=" + Celular + '}';
    }

}
