
package SuperClase;

public abstract class Ropa extends Producto {
     private String talla;
    private String marca;
    private String color;

    public Ropa() {
        super();
        this.talla = "";
        this.marca = "";
        this.color = "";
    }

    public Ropa(String talla, String marca, String color, double precio, String desc, String unidad) {
        super(precio, desc, unidad);
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Ropa{" + "Talla: " + talla + ", Marca: " + marca + ", Color: " + color + '}';
    }
    
}
