
package eva2_20_polimorfismo_figuras;

public class Circulo implements Figuras, MostrarDatos{
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio*radio*Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return radio*2*Math.PI;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Dado el radio " + radio);
        System.out.println("El área del círculo es: " + calcularArea());
        System.out.println("El perímetro del círculo es: " + calcularPerimetro());
    }
}
