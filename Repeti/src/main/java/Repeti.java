
import java.util.Scanner;


public class Repeti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String pal;
        int r,i;
        System.out.print("ingresa una plabra \n");
         pal=leer.nextLine();
          System.out.print("ingresa las veces que quiera esa palabra \n");
         r=leer.nextInt();
         for(i=0;i<r;i++){
         System.out.println(pal);
         }
    }
    
}
