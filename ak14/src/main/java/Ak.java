

/**
 *
 * @author acteck
 */
public class Ak {
    //aqui se declaran los valores 
    String tipo;
    int cargador ;
    int presicion;
    double velocidadCarga; //vc= velocidad de carga
    double precio;
    int daño;

    //metodos son aciones o interaciones del objeto
    public void disparar(){}
    public void apuntar(){}
    public void recargar(){}

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", presicion=" + presicion + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", da\u00f1o=" + daño + '}';
    }
    
}    
    

