/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

package elgranhotel.AccesoDatos;


public class TipoHabitacion {
    int codigo;
    int cantPerMaxima;
    int camas;
    String tipoCama;
    double precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantPerMaxima() {
        return cantPerMaxima;
    }

    public void setCantPerMaxima(int cantPerMaxima) {
        this.cantPerMaxima = cantPerMaxima;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoHabitacion(int codigo, int cantPerMaxima, int camas, String tipoCama, double precio) {
        this.codigo = codigo;
        this.cantPerMaxima = cantPerMaxima;
        this.camas = camas;
        this.tipoCama = tipoCama;
        this.precio = precio;
    }

    public TipoHabitacion() {
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" + "codigo=" + codigo + ", cantPerMaxima=" + cantPerMaxima + ", camas=" + camas + ", tipoCama=" + tipoCama + ", precio=" + precio + '}';
    }

}
