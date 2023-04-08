
package eva2_18_uso_interfaces;

public class EVA2_18_USO_INTERFACES {
   
    public static void main(String[] args) {

        //Figuras figu =new Figuras(); no se puede
        //MostrarDatos mostrar=new MostrarDatos();
        Circulo circu = new Circulo(50);
        circu.imprimirDtaos();
        
        System.out.println(" ");
        System.out.println(" ");
        
        Triangulo triangulo =new Triangulo(20, 20);
        triangulo.imprimirDtaos();
        
    }
    
}


