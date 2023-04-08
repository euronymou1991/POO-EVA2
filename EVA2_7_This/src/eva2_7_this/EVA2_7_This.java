
package eva2_7_this;

public class EVA2_7_This {

    public static void main(String[] args) {
   
    }
    
    public void imprimir(){
        //This.
    }
}

class Persona{
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
}