
package eva2_5_herencia_2;


public class EVA2_5_HERENCIA_2 {

   
    public static void main(String[] args) {
       SubClase obj=new SubClase();
       obj.mensaje();
    }
    
}
class SuperClase{
    public void mensaje(){
        System.out.println("Hola");
    }
}

class SubClase extends SuperClase{
    
}

//En Java: TODAS LAS CLASES TIENEN COMO SUPERCLASE A LA CLASE Object

//Object

//SuperClase

//SubClase