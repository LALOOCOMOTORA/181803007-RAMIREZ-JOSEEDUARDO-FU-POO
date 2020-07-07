/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ovnivoros;

import Animales.Animales;

/**
 * 
 * @author jose eduardo ramirez
 */
public class Ovnivoros extends Animales{
    private static final String tipoAlimento="herbivoro";
  public void herbivoros(){
   
   }
 

    public Ovnivoros(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        super(genero, habitad, edad, nombreCientifico, nombre, Ovnivoros.tipoAlimento);
    }
}
