
package eva2_9_super_2;

public class Persona {
        //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {  
    }
    
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

public void imprimirDatos(){
    System.out.println("Datos: ");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellidos: " + apellido);
    System.out.println("Edad: " + edad);
}
}
