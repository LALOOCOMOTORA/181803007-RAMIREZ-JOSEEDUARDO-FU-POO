
import java.util.Scanner;


public class nam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,m,i;
        System.out.print("recorrer de m a n  \n");
         System.out.print("ingresa la distancia n \n");
         n=leer.nextInt();
        System.out.print("ingresa la distancia m \n");
         m=leer.nextInt();
         
         for(i=n;i<=m;i++){
             System.out.println(i);
         }
    }
    
}
