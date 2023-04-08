
package eva2_14_tienda;

import Productos.Computadora;
import Productos.Jeans;


public class EVA2_14_TIENDA {

    public static void main(String[] args) {
        Computadora compu = new Computadora();
        compu.setPrecio(250);
        
        Computadora comp2 = new Computadora(6, 12, 1024, "Intel", "Toyota", 3, 100.00, "Laptop", "u");
        System.out.println(comp2);
        System.out.println("El precio de venta de 3 " + comp2.getDesc() +"s sera: " + comp2.precioVenta(5) +"$");
        System.out.println("El precio de venta de 30 " + comp2.getDesc() +"s sera: " + comp2.precioVenta(11) +"$");
        
        System.out.println("----");
        
        Jeans jean1 = new Jeans('M', "Cuero", "Toyota", "XL", "Supreme", "Azul", 50.00, "Supants", "pz");
        System.out.println(jean1);
        System.out.println("El precio de venta de 7 " + jean1.getDesc() +" sera: " + jean1.precioVenta(5) +"$");
        System.out.println("El precio de venta de 20 " + jean1.getDesc() +" sera: " + jean1.precioVenta(11) +"$");
    }
    
}
