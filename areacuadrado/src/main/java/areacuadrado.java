
import java.util.Scanner;


public class areacuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         System.out.print("calcular area   del cuadrado \n");
         System.out.print("dame la base del cuadrado \n");
         double base=leer.nextInt();
         System.out.print("dame la altura del cuadrado \n");
         double altura=leer.nextInt();
         double area;
         area=base*altura;
         
        System.out.print("el area del cuadrado es:"+area);
        // TODO code application logic here
    }
    
}
