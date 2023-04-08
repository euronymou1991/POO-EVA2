
package eva2_20_polimorfismo_figuras;

public class Triangulo implements Figuras, MostrarDatos{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
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
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        double hip = Math.sqrt((base*base)+(altura*altura));
        return hip + base + altura;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Dada la base " + base);
        System.out.println("Dada la altura " + altura);
        System.out.println("El área del triángulo es: " + calcularArea());
        System.out.println("El perímetro del triángulo es: " + calcularPerimetro());
    }
    
}
