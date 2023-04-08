
package eva2_16_interfaces;

public class Computadora extends Producto implements MostrarDatos {
    //NO SE HEREDAN INTERFACES, SE IMPLEMENTAN INTERFACES.
    
    private String marca;
    private String procesador;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Computadora() {
    }

    public Computadora(String marca, String procesador, double precio, String nombre) {
        super(precio, nombre);
        this.marca = marca;
        this.procesador = procesador;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre del producto: " + getNombre());
        System.out.println("Precio del producto: " + getPrecio());
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
    }
    
}
