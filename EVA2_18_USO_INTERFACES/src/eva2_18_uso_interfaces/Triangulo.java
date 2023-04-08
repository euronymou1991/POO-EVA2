
package eva2_18_uso_interfaces;

public class Triangulo implements Figuras, MostrarDatos {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double CalcularPeri() {
        double hip = Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2));
        return base + altura + (hip);
    }

    @Override
    public void imprimirDtaos() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Altura: " + CalcularArea());
        System.out.println("Perimetro:"  + CalcularPeri());
    }
    
    
    
}
