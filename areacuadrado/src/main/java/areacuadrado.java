
import java.util.Scanner;


public class areacuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         double base,area;
         System.out.print("calcular area   del cuadrado \n");
         System.out.print("dame un lado del cuadrado \n");
         base=leer.nextInt();
         area=base*base;
         
        System.out.print("el area del cuadrado es:"+area);
       
    }
    
}
