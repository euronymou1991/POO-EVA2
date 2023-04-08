

package eva2_16_interfaces;


public class EVA2_16_INTERFACES {

   
    public static void main(String[] args) {
   
        //MostrarDatos obj=new MostrarDatos(); NO SE PUEDE INSTANCIAR UNA INTERFACE
        
        Persona perso = new Persona("Juan Perez", 50);
        perso.imprimirDatos();
                
        System.out.println(" ");
        
        
        Computadora compu1 = new Computadora("DELL", "Intel i8", 200, "Inspiron");
        compu1.imprimirDatos();
    }
    
}
