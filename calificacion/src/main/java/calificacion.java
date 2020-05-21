
import java.util.Scanner;


  //author jose eduardo
 
public class calificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
         double c1,c2,c3,t;
         System.out.print("ingrese la calificacion en practicas y tareas  \n");
         c1=leer.nextInt();
         System.out.print("ingrese la  asistencia  \n");
         c2=leer.nextInt();
         System.out.print("ingrese la calificacion en participacion  \n");
         c3=leer.nextInt();
         c1=c1*.40;
         c2=c2*.40;
         c3=c3*.20;
         t=c1+c2+c3;
         System.out.print("el porcentaje en practicas y tareas es :"+c1+" \n");
          System.out.print("el porcentaje en asistencia es :"+c2+"\n");
         System.out.print("el porcentaje en participacion es :"+c3+" \n");
         System.out.print("la calificacion   es :"+t);
   }
    
}
