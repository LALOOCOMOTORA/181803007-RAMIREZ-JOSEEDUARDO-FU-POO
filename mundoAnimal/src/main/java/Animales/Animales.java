/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Animales;

/**
 * 
 * @author jose eduardo ramirez
 */
public class Animales {
    protected String genero;
    protected String habitad;
    protected int edad;
    protected String nombreCientifico;
    protected String nombre;
    protected String tipoAlimento;
public void Animales(){
   
   }
    
    public Animales(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        this.genero = genero;
        this.habitad = habitad;
        this.edad = edad;
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.tipoAlimento = tipoAlimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
    public String sonidoAnimal(){
    return "Sin sonido";
    }

    @Override
    public String toString() {
        return "Animales{" + "genero=" + genero + ", habitad=" + habitad + ", edad=" + edad + ", nombreCientifico=" + nombreCientifico + ", nombre=" + nombre + ", tipoAlimento=" + tipoAlimento + '}';
    }
    
    
}
