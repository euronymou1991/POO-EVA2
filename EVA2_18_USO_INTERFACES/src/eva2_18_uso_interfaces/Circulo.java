
package eva2_18_uso_interfaces;

public class Circulo implements Figuras, MostrarDatos  {
    //LA INITERFAZ ES COMO UN CONTRATO, TE OBLIGA A SEGUIR CIERTO COMPORTAMIENTO
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
        @Override
    public double CalcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double CalcularPeri() {
        return Math.PI *(radio*2);
    }

    @Override
    public void imprimirDtaos() {
        System.out.println("Radio: "+ radio);
        System.out.println("Area: " + CalcularArea());
        System.out.println("Perimetro: " + CalcularPeri());
    }
    
}
