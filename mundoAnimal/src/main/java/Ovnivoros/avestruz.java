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
public class  avestruz extends Ovnivoros{
       private static final boolean sonido=true;
    private static final String ruido="haaa-HAAAAaa";
      private static final String genero="hembra";
        private static final String nombreCientifico=" Struthio camelus";
          private static final String habitad="desiertos";
            private static final String nombre="Amy";

   


    public avestruz(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        super(avestruz.genero, avestruz.habitad, edad, avestruz.nombreCientifico, avestruz.nombre, tipoAlimento);
    }

    @Override
    public String toString() {
        return "avestruz{" +super.toString()+"Ruido="+ruido + '}';
    }
 
}
