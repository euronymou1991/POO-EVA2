
package MisClases;

public class Persona {
    private String id;
    private String nombre;
    private int edad;
    
    public void setID(String n){
        id = n;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public void setEdad(int n){
        edad = n;
    }
    
    public String getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    public void imprimirDatos(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: "+ edad);
    }
}
