/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hervivoros;

/**
 * 
 * @author jose eduardo ramirez
 */
public class vaca  extends herbivoros{
       private static final boolean sonido=true;
    private static final String ruido="muu";
      private static final String genero="hembra";
        private static final String nombreCientifico="bos prinigenius taurus";
          private static final String habitad="campo";
            private static final String nombre="animalia";

   public void vaca(){
   
   }


    public vaca(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        super(vaca.genero, vaca.habitad, edad, vaca.nombreCientifico, vaca.nombre, tipoAlimento);
    }

    @Override
    public String toString() {
        return "vaca{" +super.toString()+"Ruido="+ruido + '}';
    }
 
}
