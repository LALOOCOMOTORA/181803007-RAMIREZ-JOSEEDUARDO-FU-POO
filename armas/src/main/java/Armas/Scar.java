/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Armas;

/**
 * 
 * @author jose eduardo ramirez
 */
public class Scar extends Armas{
    private String TipoCargador;

    public Scar() {
    }

    public String getTipoCargador() {
        return TipoCargador;
    }

    public void setTipoCargador(String TipoCargador) {
        this.TipoCargador = TipoCargador;
    }
    //super manda a llamar a la super clase o clase padre
    public Scar(String tipo, int cargador, int presicion, double velocidadCarga, double precio, int daño, double VelocidadDisparo) {
        super(tipo, cargador, presicion, velocidadCarga, precio, daño, VelocidadDisparo);
    }

    public Scar(String TipoCargador) {
        this.TipoCargador = TipoCargador;
    }

    public Scar(String TipoCargador, String tipo, int cargador, int presicion, double velocidadCarga, double precio, int daño, double VelocidadDisparo) {
        super(tipo, cargador, presicion, velocidadCarga, precio, daño, VelocidadDisparo);
        this.TipoCargador = TipoCargador;
    }
    

}
