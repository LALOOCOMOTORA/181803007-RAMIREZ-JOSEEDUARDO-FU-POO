/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Carnivoros;

/**
 * 
 * @author jose eduardo ramirez
 */
public class leon extends Carnivoros{
    private static final boolean sonido=true;
    private static final String ruido="roooar";
      private static final String genero="macho";
        private static final String nombreCientifico="bos prinigenius taurus";
          private static final String habitad="sabana";
            private static final String nombre="alex";




    public leon(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        super(leon.genero, leon.habitad, edad, leon.nombreCientifico, leon.nombre, tipoAlimento);
    }

    @Override
    public String toString() {
        return "leon{" +super.toString()+"Ruido="+ruido + '}';
    }
 
}