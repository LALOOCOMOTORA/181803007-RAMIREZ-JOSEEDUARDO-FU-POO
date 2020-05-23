
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acteck
 */
public class numeromisterioso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int n=0,r = 0;
          System.out.println("numero que desas adivinar? (en un futuro sera aleatorio jijiji)  \n");
          n=leer.nextInt();
          do{
              r=0;
              System.out.println("ingresa el numero que crees que sea el numero misterioso \n");
              r=leer.nextInt();
              if(r>n){
                  System.out.println("el numero esta arriba del numero a adivinar  \n");
              }
              else{
                  System.out.println("el numero esta abajo del numero a adivinar  \n");
              }
          }while(r!=n);
          System.out.println("felicidades adivinaste  \n");
    }
        // TODO code application logic here
    }
    

