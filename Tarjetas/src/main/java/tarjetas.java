/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acteck
 */
public class tarjetas {

    double cuenta;
    String nombre;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;

    public tarjetas() {
    }

    public tarjetas(double cuenta, String nombre, int dia, int mes, int anio, int cv, double monto, double apartado) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cv = cv;
        this.monto = monto;
        this.apartado = apartado;

    }
    public double total(){
        return this.monto + this.apartado;
    }

    public tarjetas verificarCuenta(int cuenta, int nip) {
        if (cuenta == 123123 && nip == 1133) {
           
           return new   tarjetas(154302002,"eduardo dias flores ",31,12,2032,544,45987.22,550);
           
        } else if (cuenta == 456789 && nip == 3367) {
            
            return new tarjetas(154302003,"kevin mesa gonzales",31,12,2032,544,360,5322.23);
            
           
        }else{
            return new tarjetas();
        
        }
    }   
        
    public void deposito(double monto){
        this.monto+=monto;
    }
   
    public void retiro(double monto){
        this.monto-=monto;
    }
   

    

    @Override
    public String toString() {
        return "tarjetas{" + "cuenta=" + cuenta + "\n nombre=" + nombre + "\n fecha de vencimiento=" + dia + "/" + mes + "/" + anio + "\n cv=" + cv + "\n monto=" + monto + "\n apartado=" + apartado + "\n total: "+this.total() + '}';
    }

   

}
