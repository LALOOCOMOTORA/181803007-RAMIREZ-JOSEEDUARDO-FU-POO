/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ovnivoros;

/**
 * 
 * @author jose eduardo ramirez
 */
public class chimpanse extends Ovnivoros{
     private static final boolean sonido=true;
    private static final String ruido="huahuahua";
      private static final String genero="macho";
        private static final String nombreCientifico="Pan troglodytes";
          private static final String habitad="samana";
            private static final String nombre="gukon";

   
 public chimpanse(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        super(chimpanse.genero, chimpanse.habitad, edad, chimpanse.nombreCientifico, chimpanse.nombre, tipoAlimento);
    }
  @Override
    public String toString() {
        return "chimpanse{" +super.toString()+"Ruido="+ruido + '}';
    }
 

   


   

}
