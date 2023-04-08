
package eva2_19_polimorfismo;

public class EVA2_19_POLIMORFISMO {

    public static void main(String[] args) {
        Docentes docente1 = new Docentes("Sergio ", " Fernandez ", 50 , " Tarahumara");
        //docente1.imprimirDatos();
        
        System.out.println("");
        
        Estudiante estudiante1 = new Estudiante("Andrea ", " Zaragoza ", 19 , "225500987");
        //estudiante1.imprimirDatos();
        
        
        
        //EN RESUMEN, ESTO ES POLIMORFISMO:
        //Va de la subclase a la superclase
        //Convierto objetos de subclases a objetos de superclases
        Persona persona1 = docente1; //Las personas no tienen plaza, pero acabamos de asignarle una.
        persona1.imprimirDatos();
        
        System.out.println("");
        
        Persona persona2 = estudiante1; //Las persona no tienen número de control, pero pueden tenerlo, y esta persona lo tiene.
        persona2.imprimirDatos();
        //Se pueden asignar objetos de una clase a objetos de otra.
            
        
        //No se puede hacer conversión de super clase a subclase
        //EN este caso, no existe la plaza
        Persona persona3 = new Persona();
        //Docentes docente3 = persona3;

        
    }
    
}
