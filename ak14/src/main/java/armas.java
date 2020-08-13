//clase para hacer una plantilla de objetos = clase los datos ahora se llaman atributos 

/**
 *
 * @author acteck
 */
public class armas {

    public static void main(String[] args) {
        Ak bronce=Ak();
        bronce.tipo="bronce";
        bronce.cargador=5;
        bronce.presicion=75;
        bronce.velocidadCarga=5;
        bronce.precio=1000;
        bronce.daño=10;
        System.out.print(bronce.toString());
        
        
        // TODO  application logic here
    }

    private static Ak Ak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    }
    

