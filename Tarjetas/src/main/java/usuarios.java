/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author acteck
 */


public class usuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nip, cuenta, opcion=0;
        tarjetas tarjeta;
       Scanner leer=new Scanner(System.in);
        System.out.println("dame tu numero de cuenta");
        cuenta = leer.nextInt();
        System.out.println("dame tu numero de nip");
        nip = leer.nextInt();
        tarjeta = new tarjetas().verificarCuenta(cuenta, nip);
        
        System.out.println("tu nombre es el sigiente shavo: "+tarjeta.nombre);
        
        
        
       do{
        System.out.println("1. hacer un deposito");
        System.out.println("2. hacer un retiro");
        System.out.println("3. eliminar apartado");
        System.out.println("4. imprimir datos de la cuenta");
        System.out.println("5. salir");
        opcion = leer.nextInt();
        System.out.println("\n");
         
        
        
        switch (opcion) {
            case 1:
                 System.out.println("inserte el monto a depositar");
                 tarjeta.deposito(leer.nextDouble());
                  System.out.println("tu cuenta es de : " + tarjeta.monto);
                 break;
            case 2:
                  System.out.println("inserte el monto a retiras");
                 tarjeta.retiro(leer.nextDouble());
                  System.out.println("tu cuenta es de : " + tarjeta.monto);
                 break;
            case 3:
                System.out.println("opcion aun no disponible");
                break;
            case 4:
                System.out.println(tarjeta.toString());
                break;

        }
       }while(opcion!=5);
        

    }

}
