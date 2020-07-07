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
public class zorro  extends Carnivoros{
    private static final boolean sonido=true;
    private static final String ruido="zzzrrr";
      private static final String genero="macho";
        private static final String nombreCientifico="Vulpes vulpes";
          private static final String habitad="bosques,praderas,taiga";
            private static final String nombre="sabu";




    public zorro(String genero, String habitad, int edad, String nombreCientifico, String nombre, String tipoAlimento) {
        super(zorro.genero, zorro.habitad, edad, zorro.nombreCientifico, zorro.nombre, tipoAlimento);
    }

    @Override
    public String toString() {
        return "zorro{" +super.toString()+"Ruido="+ruido + '}';
    }
 
}