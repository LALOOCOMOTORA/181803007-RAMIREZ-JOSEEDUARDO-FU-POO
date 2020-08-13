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

   
    public static void main(String[] args) {
        int nip, cuenta, opcion=0;
        tarjetas tarjeta;
       Scanner leer=new Scanner(System.in);
        System.out.println("dame tu numero de cuenta");
        cuenta = leer.nextInt();
        System.out.println("dame tu numero de nip");
        nip = leer.nextInt();
        tarjeta = new tarjetas(154302002, "eduardo dias flores ", 31, 12, 2032, 544, 550, 45987.22).verificarCuenta(cuenta, nip);
        if(tarjeta.nombre != null){
       
        
        System.out.println("tu nombre es el sigiente shavo: "+tarjeta.nombre);
        
        
        
       do{
        System.out.println("1. hacer un deposito");
        System.out.println("2. hacer un retiro");
        if(tarjeta.apartado==0){
             System.out.println("3. crear apartado");
        }
        else{
        System.out.println("3. eliminar apartado");
        }
        System.out.println("4. imprimir datos de la cuenta");
        if(tarjeta.tarjetacv==0){
             System.out.println("6. crear tarjeta virtual ");
        }
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
                if(tarjeta.apartado==0){
                System.out.println("inserte un monto de apartado a ingresar ");
                tarjeta.crear(leer.nextDouble());
                System.out.println("tu apartado es de : " + tarjeta.apartado);
                 System.out.println("tu monto nuevo es : " + tarjeta.monto);
                }
                else{
                   
                tarjeta.eli();
                System.out.println("tu apartado es de : " + tarjeta.apartado);
                 System.out.println("tu monto nuevo es : " + tarjeta.monto);    
            }
                break;
            case 4:
                System.out.println(tarjeta.toString());
                break;
            case 6:
               
                
                System.out.println("ingresa un nuevo nip para su tarjeta virtual virtual solo cuatro nuemros");
                tarjeta.virtual(leer.nextInt());
                System.out.println(tarjeta.toString());
                
                break;
        }
       }while(opcion!=5);
        } else {
            System.out.println("la cuenta ingresada no existe");
        }
        

    }

}
