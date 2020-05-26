
import java.util.Scanner;


public class mayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
         int nacimiento,año=2020,edad;
         System.out.print("calcular si eres mayor de edad  \n");
         System.out.print("ingresa el año del nacimineto \n");
         nacimiento=leer.nextInt();
         edad=año-nacimiento;
         if(edad>=18){
          System.out.print("tu ya eres mayor de edad  :)");    
         }
         else{
             System.out.print("tu no  eres mayor de edad :C ");
         }
         
    }
    
}
