/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acteck
 */
public class juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ak bronce= new Ak();
        bronce.tipo="bronce";
        bronce.cargador=5;
        bronce.presicion=75;
        bronce.velocidadCarga=5;
        bronce.precio=1000;
        bronce.daño=10;
        bronce.VelocidadDisparo=10;
        
        Ak plata= new Ak();
        plata.tipo="plata";
        plata.cargador=8;
        plata.presicion=70;
        plata.velocidadCarga=4.5;
        plata.precio=2300;
        plata.daño=11;
        plata.VelocidadDisparo=9.8;
        
        Ak oro= new Ak();
        oro.tipo="oro";
        oro.cargador=5;
        oro.presicion=75;
        oro.velocidadCarga=5;
        oro.precio=1000;
        oro.daño=10;
        oro.VelocidadDisparo=9.4;
        Ak diamante= new Ak();
        diamante.tipo="diamante";
        diamante.cargador=20;
        diamante.presicion=95;
        diamante.velocidadCarga=3;
        diamante.precio=4000;
        diamante.daño=20;
        diamante.VelocidadDisparo=8;
        System.out.println(bronce.toString());
        System.out.println(plata.toString());
        System.out.println(oro.toString());
        System.out.println(diamante.toString());
        // TODO code application logic here
        
    }
    
}
