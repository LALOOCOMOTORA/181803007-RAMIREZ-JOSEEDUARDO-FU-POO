
/**
 *
 * @author acteck
 */
public class casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //casting explicito
        short a=1;
        int b=15;
        a=(short)b;
        //casting implicito
        float c=4.3f;
        double d=5.6;
        d=c;
        // decimal a int
        double pi=3.1416;
        int duda=0;
        pi=(double)duda;
        //convertir los string
        String valor= "15";
        int r=0;
        r= Integer.parseInt(valor);
        duda=duda+r;
        System.out.println("duda");
        
        // TODO code application logic here
    }
    
}
