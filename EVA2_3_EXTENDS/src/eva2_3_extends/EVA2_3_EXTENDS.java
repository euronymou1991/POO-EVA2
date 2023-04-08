
package eva2_3_extends;


public class EVA2_3_EXTENDS {


    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.setNombre("Emilio");
        estu.setApellidos("Sanchez");
        estu.setEdad(20);
        estu.setNoControl("22550401");
        
        System.out.println("Datos del estudiante:");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellidos());
        System.out.println(estu.getEdad() + " años");
        System.out.println(estu.getNoControl());
        
        Docentes doce1 = new Docentes();
        doce1.setNombre("Mario");
        doce1.setApellidos("Hernandez");
        doce1.setEdad(30);
        doce1.setPlaza("Central/&%$#96");
    }
    
}
