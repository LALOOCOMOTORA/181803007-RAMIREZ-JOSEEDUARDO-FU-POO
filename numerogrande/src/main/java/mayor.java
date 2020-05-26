
import java.util.Scanner;


public class mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1,n2;
        Scanner leer=new Scanner(System.in);
         System.out.print("calcular si un numero es mayor que otro  \n");
         System.out.print("ingresa un nuemro \n");
         n1=leer.nextInt();
         System.out.print("ingresa otro nuemro \n");
         n2=leer.nextInt();
        if(n1>n2){
            System.out.print("el numero mayor es:" + n1);
        }
        else{
        System.out.print("el numero mayor es:" + n2);
        }
        
    }
    
}
