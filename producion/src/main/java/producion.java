
import java.util.Scanner;


 //author eduardo
 
public class producion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         int p,d,t;
         System.out.print("ingrese la cantidad de piezas producidas  \n");
         p=leer.nextInt();
         System.out.print("ingrse la cantidad de piezas defectuosas  \n");
         d=leer.nextInt();
         t=(d*100)/p;
         System.out.print("el porsentaje de piezas defectuosas es :"+t+"%");
    }
    
}
