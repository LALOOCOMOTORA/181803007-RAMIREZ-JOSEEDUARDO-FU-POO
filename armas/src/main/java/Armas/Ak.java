package Armas;

public class Ak extends Armas {
    //aqui se declaran los valores 

    private String tipo;

    public Ak(String tipo) {
        this.tipo = tipo;
    }

    public Ak(String tipo, String string, int i, int i1, double d, double d1, int i2, double d2) {
        super(string, i, i1, d, d1, i2, d2);
        this.tipo = tipo;
    }

    public Ak(int tipo) {
        switch (tipo) {
            case 0:
                super.tipo = "Madera";
                super.cargador = 4;
                super.presicion = 20;
                super.velocidadCarga = 1;
                super.precio = 1;
                super.daño = 10;
                super.VelocidadDisparo = 20;

                break;
            case 1:
                this.tipo = "Bronce";
                this.cargador = 5;
                this.presicion = 65;
                this.velocidadCarga = 5;
                this.precio = 1000;
                this.daño = 10;
                this.VelocidadDisparo = 20;
                break;
            case 2:
                this.tipo = "Plata";
                this.cargador = 8;
                this.presicion = 70;
                this.velocidadCarga = 4.5;
                this.precio = 2300;
                this.daño = 15;
                this.VelocidadDisparo = 22;
                break;
            case 3:
                this.tipo = "Oro";
                this.cargador = 10;
                this.presicion = 80;
                this.velocidadCarga = 2.0;
                this.precio = 4500;
                this.daño = 20;
                this.VelocidadDisparo = 28;
                break;
            case 4:
                this.tipo = "Diamante";
                this.cargador = 38;
                this.presicion = 180;
                this.velocidadCarga = 1;
                this.precio = 10000;
                this.daño = 33;
                this.VelocidadDisparo = 38;
                break;
        }
    }

//metodos son aciones o interaciones del objeto
    public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int daño, double velocidadDisparo) {
        this.tipo = tipo;
        this.cargador = cargador;
        this.presicion = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.daño = daño;
        this.VelocidadDisparo = velocidadDisparo;
    }

    public Ak() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String menuAk() {
        System.out.println("¿que arma deseas?");
        System.out.println("Menu:");
        System.out.println("0-Madera");
        System.out.println("1-Bronce");
        System.out.println("2-Plata");
        System.out.println("3-Oro");
        System.out.println("4-Diamante");
        return null;

    }

    public double disparar() {
        return (this.daño * this.presicion) / 100;
    }

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", presicion=" + presicion + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", dañio=" + daño + ", VelocidadDisparo=" + VelocidadDisparo + '}';
    }

}
