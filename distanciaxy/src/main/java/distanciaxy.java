import java.util.Scanner;





public class distanciaxy {
    

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        double x,x1,y,y1,r;
         Scanner leer=new Scanner(System.in);
         System.out.print("ingrese la cordena 1  en el eje x  \n");
         x=leer.nextInt();
         System.out.print("ingrese la cordena 1  en el eje y  \n");
         y=leer.nextInt();
         System.out.print("ingrese la cordena 2  en el eje x  \n");
         x1=leer.nextInt();
         System.out.print("ingrese la cordena 2  en el eje y  \n");
         y1=leer.nextInt();
         x=x1-x;
         x=x*x;
         y=y1-y;
         y=y*y;
         r = Math.sqrt(x+y);
         System.out.print("la distania entre el punto 1 y 2 es:"+r);

    }
    
}
