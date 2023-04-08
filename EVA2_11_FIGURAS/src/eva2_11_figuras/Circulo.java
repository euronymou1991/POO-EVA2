
package eva2_11_figuras;

public class Circulo extends Figuras{
        private double radio;

    public Circulo() {
        radio = 9;
    }
   

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularPeri(){
        return (radio*2)*Math.PI;
    }
    
    @Override
    public double calcularArea(){
       return (radio*radio)*Math.PI;
    }
    
    @Override
    public String toString(){
        String cade = "Datos del Circulo: \n" +
                      "Radio: " + radio + "\n" +
                      "Area: " + calcularArea() + "\n" +
                      "Perimetro: " + calcularPeri();
        return cade;
    }
}
