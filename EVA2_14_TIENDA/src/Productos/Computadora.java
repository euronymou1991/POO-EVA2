
package Productos;

import SuperClase.Electronica;

public final class Computadora extends Electronica{
    private int memoria;
    private double tamano;
    private int discoDuro;

    public Computadora() {
        super();
        this.memoria = 0;
        this.tamano = 0.0;
        this.discoDuro = 0;
    }

    public Computadora(int memoria, double tamano, int discoDuro, String fabricante, String modelo, int garantia, double precio, String desc, String unidad) {
        super(fabricante, modelo, garantia, precio, desc, unidad);
        this.memoria = memoria;
        this.tamano = tamano;
        this.discoDuro = discoDuro;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    
    @Override
    public double precioVenta(int cant){
        // despues de cierta cantidad, hay descuento
        if (cant <= 10)
            return precio * cant;
        else
            return (precio * 0.8) * cant;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Computadora{" + "Memoria: " + memoria + " GB, Tamaño de pantalla: " + tamano + " pulgadas, Disco duro: " + discoDuro + " GB}";
    }
    
}
