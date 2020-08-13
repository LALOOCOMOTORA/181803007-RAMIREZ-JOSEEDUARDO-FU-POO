package Operaciones;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * 
 * @author jose eduardo ramirez
 */
public class OperacionesAritméticas {
    int resultado,n1,n2;
    double dresultado;
   public String suma(String numero1,String numero2){
       
               int n1=Integer.parseInt(numero1);
               int n2=Integer.parseInt(numero2);
                resultado=n1+n2;
        
       String suma=Integer.toString(resultado);
       System.out.println("resultado funcion "+resultado);
      return suma; 
   }
   public String resta(String numero1,String numero2){
      
               int n1=Integer.parseInt(numero1);
               int n2=Integer.parseInt(numero2);
                resultado=n1-n2;
        
       String resta=Integer.toString(resultado);
       System.out.println("resultado funcion "+resultado);
       return resta; 
   } 
   public String multiplicacion(String numero1,String numero2){
      
               int n1=Integer.parseInt(numero1);
               int n2=Integer.parseInt(numero2);
                resultado=n1*n2;
        
       String multiplicacion=Integer.toString(resultado);
       System.out.println("resultado funcion "+resultado);
       return multiplicacion; 
   }
   public String division(String numero1,String numero2){
      
               double n1=Integer.parseInt(numero1);
               double n2=Integer.parseInt(numero2);
                dresultado=n1/n2;
           
       
       String divicionString=Double.toString(dresultado);
       System.out.println("resultado funcion "+resultado);
       return divicionString; 
   } 
   

}
