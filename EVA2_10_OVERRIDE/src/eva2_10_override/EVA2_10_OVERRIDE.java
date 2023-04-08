
package eva2_10_override;

public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        Persona perso1=new Persona();
        Persona perso2=new Persona("Hector Suarez",50);
        System.out.println(perso1);
        System.out.println(perso2);
        
    }
    
}
 class Persona{
     private String nombre;
     private int edad;

     public Persona(String Nombre, int Edad){
     this.nombre =nombre;
     this.edad= edad;
 }
     public Persona(){
         nombre="Hector Suarez";
         edad= 80;
     }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }  
    @Override
    public String toString(){
     String cade= "Datos: \n "+
                   "Nombre: "+ nombre + "\n" +
                   "Edad: " + edad;
       return cade;
}
 }

