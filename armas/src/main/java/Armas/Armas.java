package Armas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author jose eduardo ramirez
 */
public class Armas {
    protected String tipo;
    protected int cargador;
    protected int presicion;
    protected double velocidadCarga; //vc= velocidad de carga
    protected double precio;
    protected int daño;
    protected double VelocidadDisparo;
    public Armas(){
    }

    public Armas(String tipo, int cargador, int presicion, double velocidadCarga, double precio, int daño, double VelocidadDisparo) {
        this.tipo = tipo;
        this.cargador = cargador;
        this.presicion = presicion;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.daño = daño;
        this.VelocidadDisparo = VelocidadDisparo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCargador() {
        return cargador;
    }

    public void setCargador(int cargador) {
        this.cargador = cargador;
    }

    public int getPresicion() {
        return presicion;
    }

    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }

    public double getVelocidadCarga() {
        return velocidadCarga;
    }

    public void setVelocidadCarga(double velocidadCarga) {
        this.velocidadCarga = velocidadCarga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public double getVelocidadDisparo() {
        return VelocidadDisparo;
    }

    public void setVelocidadDisparo(double VelocidadDisparo) {
        this.VelocidadDisparo = VelocidadDisparo;
    }

    @Override
    public String toString() {
        return "Armas{" + "tipo=" + tipo + ", cargador=" + cargador + ", presicion=" + presicion + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", da\u00f1o=" + daño + ", VelocidadDisparo=" + VelocidadDisparo + '}';
    }
    
}
