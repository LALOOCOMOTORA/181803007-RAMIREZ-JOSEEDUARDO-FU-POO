
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acteck
 */
public class formulario {
     Date fecha=new Date();
       
    String matricula;
    String titulo;
    String texto1;
    String texto2;
    String resumen;
    String autor;
    String fechaP;
    String fechaA;
    String fechaB;
    String status;
    String tipo;
   
    int dia;
    int mes;
    int año;
    public void fechaPublicacion(){}
    public void fechaAlta(){}
    public void fechaBaja(){}
    public void aviso(){}

    @Override
    public String toString() {
        return "formulario{" + "matricula=" + matricula + ", titulo=" + titulo + ", texto1=" + texto1 + ", texto2=" + texto2 + ", resumen=" + resumen + ", autor=" + autor + ", fechaP=" + fechaP + ", fechaA=" + fechaA + ", fechaB=" + fechaB + ", status=" + status + ", tipo=" + tipo + ", dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
    
     
    
    
}
