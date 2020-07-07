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
public class toro  extends herbivoros {
    private static final boolean sonido=true;
    private static final String ruido="moooo";
      private static final String genero="macho";
        private static final String nombreCientifico="bos prinigenius taurus";
          private static final String habitad="campo";
            private static final String nombre="aldebaran";
            public void toro(){
   
   }

    public toro(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        super(toro.genero, toro.habitad, edad, toro.nombreCientifico, toro.nombre, tipoAlimento);
    }

    @Override
    public String toString() {
        return "toro{" +super.toString()+"Ruido="+ruido + '}';
    }

   
    

}
