
import java.util.Scanner;


public class edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //jose eduardo ramirez mendoza
        Scanner leer=new Scanner(System.in);
         int nacimiento,año=2020,edad;
         System.out.print("calcular tu edad  \n");
         System.out.print("ingresa el año del nacimineto \n");
         nacimiento=leer.nextInt();
         edad=año-nacimiento;
         System.out.print("tu edad es: \n"+edad);
         
        
    }
    
}
