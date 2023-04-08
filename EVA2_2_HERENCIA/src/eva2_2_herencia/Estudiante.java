package eva2_2_herencia;


public class Estudiante {
    //ATRIBUTOS    
    private String nombre;
    private String apellidos;
    private int edad;
    private String noControl;

    public Estudiante(String nombre, String apellidos, int edad, String noControl) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.noControl = noControl;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
}
