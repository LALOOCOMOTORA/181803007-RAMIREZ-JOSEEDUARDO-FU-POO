package Personaje;

import Armas.Ak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jose eduardo ramirez
 */
public class Personaje {

    protected int vida;
    protected String nombre;
    protected Ak arma;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ak getArma() {
        return arma;
    }

    public void setArma(Ak arma) {
        this.arma = arma;
    }

    public Personaje() {
        this.vida = 100;
    }

    public Personaje(String nombre) {
        this();
        this.nombre = nombre;
        this.arma = new Ak();

    }
    public String menuAk(){
    return this.arma.menuAk();
    }
    public double dispararArma(){
    return this.arma.disparar();
    }
    public void equiparArma(int valor) {
        arma = new Ak(valor);
    }

    public void recibirDanio(double daño) {
        this.vida -= daño;
    }

    @Override
    public String toString() {
        return "Personaje{" + "Nombre=" + nombre + "\n" + " Vida= " + vida + "\n" + " Arma= " + arma + '}';
    }

}
