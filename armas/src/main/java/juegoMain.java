


import Personaje.Personaje;
import java.util.Scanner;
import Personaje.*;
import Armas.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acteck
 */
public class juegoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
       Scanner leer=new Scanner(System.in);
       Personaje samuel= new Personaje("samuel");
       System.out.println(samuel.menuAk()); 
       int valor=leer.nextInt();
       samuel.equiparArma(valor);
       System.out.println(samuel);
       
      
       
    // Ak bronce =new Ak ("bronce",5,65,5,1000,10,20);
      // Ak plata = new Ak("plata",8,70,4.5,2300,11,9.8);
      //Ak oro = new Ak("oro",5,75,5,3000,10,9.4);
      //Ak diamante = new Ak("diamante",20,95,3,4000,20,8);
     
     
        // TODO code application logic here

    
  
  
     
}
    
}



        