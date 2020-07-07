/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 * @author jose eduardo ramirez
 */

package Hervivoros;
import Animales.Animales;




public class herbivoros extends Animales{
    private static final String tipoAlimento="herbivoro";
  public void herbivoros(){
   
   }
 

    public herbivoros(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        super(genero, habitad, edad, nombreCientifico, nombre, herbivoros.tipoAlimento);
    }

   
    
    
    
    
    

}
