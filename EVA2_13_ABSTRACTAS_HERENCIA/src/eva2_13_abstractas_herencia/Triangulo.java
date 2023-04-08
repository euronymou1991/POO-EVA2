
package eva2_13_abstractas_herencia;

public class Triangulo extends Figuras {
    private double base;
      private double altura;

    public Triangulo() {
        base = 10;
        altura = 10;
    }
   

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularPeri(){
        double hip = Math.sqrt((base*base) + (altura*altura));
        return hip + base + altura;
    }
    
    @Override
    public double calcularArea(){
       return (base* altura) /2;
    }
    
    @Override
    public String toString(){
        String cade = "Datos del Triangulo: \n" +
                      "Area: " + calcularArea() + "\n" +
                      "Perimetro: " + calcularPeri();
        return cade;
    }
}
