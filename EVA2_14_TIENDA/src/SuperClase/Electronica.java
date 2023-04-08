
package SuperClase;

public abstract class Electronica extends Producto{
    private String fabricante;
    private String modelo;
    private int garantia;

    public Electronica() {
        super();
        this.fabricante = " ";
        this.modelo = " ";
        this.garantia = 0;
    }

    public Electronica(String fabricante, String modelo, int garantia, double precio, String desc, String unidad) {
        super(precio, desc, unidad);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Electronica{" + "Fabricante: " + fabricante + ", Modelo: " + modelo + ", Garantia: " + garantia + " dias}";
    }
}
