
package eva2_6_herencia_constructores;

public class Mamifero extends Animal{
    public Mamifero(){
        System.out.println("Constructor de mamífero: sangre caliente");
    }
    
    public void tenerPelo(){
        System.out.println("Tienen pelo");
    }
}
