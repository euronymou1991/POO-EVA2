
package eva2_20_polimorfismo_figuras;

import java.util.Scanner;
import java.awt.BorderLayout;

public class EVA2_20_POLIMORFISMO_FIGURAS {

    
    public static void main(String[] args) {
    
        /* Circulo circu =new Circulo (5);
        circu.imprimirDatos();
        //FIGURA ES PADRE DE CIRCULO
        //PODEMOS ASIGNAR UN OBJETO CIRCULO A UNA VARIABLE FIGURA
        Figuras figu=circu;
        System.out.println(" USANDO FIGURAS: ");
        System.out.println(" area:  "+ figu.calcularArea());
        System.out.println(" Perimetro "+ figu.calcularPeri()); */
    
        /* int [] arreglo = new int [10]; //ARREGLO QUE GURADA 10 ENTEROS
        //UN ARREGLO DONDE INICIA Y DONDE TERMINA?
        //Primer posicion:0
        //Ultima posicion: N-1, N cantidad de elementos del arreglo
        arreglo[0]= 100;
         System.out.println( arreglo[0]); */
    
         System.out.println("Cuantas figuras necesitas?");
         Scanner input = new Scanner(System.in);
         int cant =input.nextInt();
         Figuras [] figuras=new Figuras[cant];
         
         for (int i=0; i<figuras.length;i++){
    
            System.out.println("Que tipo de figura necesitas: 1. Circulo, 2. Triangulo");
         
         int tipo = input.nextInt();
         if (tipo==1){//CIRCULO
             Circulo circu=new Circulo();
             System.out.println(" Introduce el radio: ");
             circu.setRadio (input.nextDouble()); //CAPTURAMOS EL DATO DEL CIRCULO
             figuras [i] =circu;
             
         }else{//TRIANGULO
             Triangulo trian = new Triangulo();
                  System.out.println(" Introduce la base: ");
             trian.setBase(input.nextDouble()); 
                 System.out.println(" Introduce la altura: ");
             trian.setAltura(input.nextDouble()); 
             figuras [i] =trian;
         }
         }
         //IMPRIMIR LOS RESULTADOS
         for (int i=0; i < figuras.length;i++){
             if (figuras[i] instanceof Circulo){
                 System.out.println("Circulo: " + i);
             //CASTING: --> CONVERSION
             // EJEMPLO
             //int val= (int) (Math.random() *100)
                     Circulo circu= (Circulo)figuras[i];
                     circu.imprimirDatos();}
                     else{
                  System.out.println("Triangulo: "+i);
                  //CASTING 
                  Triangulo trian =(Triangulo)figuras[i]; //RECUPERO  LA FIGURA ORIGINAL
                  trian.imprimirDatos();
                 //System.out.println("Area: "+ figuras[i].calcularArea());
                 //System.out.println("Perimetro: "+ figuras[1].calcularPeri());
                 }
         
         
         /* Circulo [] circulos=new Circulo[cant];
         for (int i :0;i < circulos.length ;i++){
                circulos [i]=new Circulos();
         }
        for (int i :0;i < circulos.length ;i++){
                circulos [i].imprimirDatos */
         }
    }
}
    
