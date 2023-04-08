
package eva2_21_polimorfismo_vehiculos;


public class EVA2_21_POLIMORFISMO_VEHICULOS {

   
    public static void main(String[] args) {
        
        Automovil auto1= new Automovil(" Volskwagen ", 2000, " Vocho ", 0);
        modificarVel(auto1,20);
        Bicicleta bic1= new Bicicleta(" Cerro", "Apache", 0);
        modificarVel(bic1,10);
        
    }
    public static void modificarVel(ControlarDatos datos, int vel){
        datos.cambiarVelocidad(vel);
        datos.tablero();
    }
}


class Vehiculo {
    private String marca;
            protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = " --- ";
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

   
}

interface ControlarDatos{
    void cambiarVelocidad(int cambio);
    abstract void tablero();
}

class Automovil extends Vehiculo implements ControlarDatos {
    private String modelo;
    private int fecha;

    public Automovil(String marca, int velocidad, String modelo, int fecha) {
        super(marca, velocidad);
        this.modelo = " ---";
        this.fecha = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel= velocidad + cambio;
        if (vel >= 0)
            velocidad = vel;
    }

    @Override
    public void tablero() {
        System.out.println("Automovil:");
        System.out.println(" Velocidad: "+ velocidad);
        System.out.println(" Combustible: (Pendiente)");
        System.out.println(" Revoluciones: (Pendiente)");
    }
    
}

class Bicicleta extends Vehiculo implements ControlarDatos{
    private String tipo;

    public Bicicleta(String tipo, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = " --- ";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
         int vel= velocidad + cambio;
        if (vel >= 0)
            velocidad = vel;
    }

    @Override
    public void tablero() {
        System.out.println("Bicicleta: ");
        System.out.println(" Velocidad: "+ velocidad);
    }
    
}

