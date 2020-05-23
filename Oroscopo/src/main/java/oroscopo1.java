
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
public class oroscopo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia,mes;

        System.out.println("Qué día naciste ? \n");
        dia = leer.nextInt();

        System.out.println("Qué mes naciste (1-12) \n ");
        mes = leer.nextInt();
        
    switch (mes) {
        case 1:
            if (dia > 21) {
                System.out.println("tu signo es :Acuario"); 
            } else {
                System.out.println("tu signo es :Capricornio");
            }
            break;
        case 2:
                if (dia > 19) {
                    System.out.println("tu singo es :piscis");
                } else {
                    System.out.println("tu signo es :Acuario");
                }
                break;
        case 3:
                if (dia > 20) {
                    System.out.println("tu signo es :Aries");
                } else {
                    System.out.println("tu signo es :Piscis");
                }
                break;
        case 4:
                if (dia > 20) {
                    System.out.println("tu signo es :Tauro");
                } else {
                    System.out.println("tu signo es :Aries");
                }
                break;
        case 5:
                if (dia > 21) {
                    System.out.println("tu signo es :Geminis");
                } else {
                    System.out.println("tu signo es :Tauro");
                }
                break;
        case 6:
                if (dia > 20) {
                    System.out.println("tu signo es :Cancer");
                } else {
                    System.out.println("tu signo es :Geminis");
                }
                break;
        case 7:
                if (dia > 22) {
                    System.out.println("tu signo es :Leo");
                } else {
                    System.out.println("tu signo es :Cancer");
                }
                break;
        case 8:
                if (dia > 21) {
                    System.out.println("tu signo es :Virgo");
                } else {
                    System.out.println("tu signo es :Leo");
                }
                break;
        case 9:
                if (dia > 22) {
                    System.out.println("tu signo es :Libra");
                } else {
                    System.out.println("tu signo es :Virgo");
                }
                break;
        case 10:
                if (dia > 22) {
                    System.out.println("tu signo es :Escorpion");
                } else {
                    System.out.println("tu signo es :Libra");
                }
                break;
        case 11:
                if (dia > 21) {
                    System.out.println("tu signo es :Sagitario");
                } else {
                    System.out.println("tu signo es :Escorpion");
                }
                break;
        case 12:
                if (dia > 21) {
                    System.out.println("tu signo es :Capricornio");
                } else {
                    System.out.println("tu signo es :Sagitario");
                }
        break;
    }
        
    }
    
}
