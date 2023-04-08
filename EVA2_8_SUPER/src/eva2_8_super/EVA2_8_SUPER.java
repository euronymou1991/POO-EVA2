
package eva2_8_super;


public class EVA2_8_SUPER {

    public static void main(String[] args) {
       Animal animal= new Animal(100);
       Mamifero mamifero = new Mamifero("Negro", 50);
       Perros perro = new  Perros();
       
    }
    
}

class Animal{
    private int peso;

    public int getPeso() {
        return peso;
    }
    
     public void setPeso(int peso) {
        this.peso = peso;
    }
    
     public Animal(){
         System.out.println("Esta vivo");
     }
    public Animal(int peso) { //CONSTRUCTOR 2
        this.peso = peso;
        System.out.println("Animal: Estoy vivo CONSTRUCTOR2 2");
    }

    public void respirar(){
        System.out.println("Animal: Estoy respirando");
    }
    public void comer(){
        System.out.println("Animal: Estoy comiendo");
    }
}

class Mamifero extends Animal {
    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    Mamifero(){
        super(); //Llamada al constructor de la superclase. En nuestro caso, llama Animal();
        //Siempre debemos llamar primero al csontructor de la superclase
        System.out.println("Es un mamífero");
    }

  public Mamifero(String colorPelo, int peso) {
        super(peso); //SIEMPRE LLAMAMOS AL CONSTRUCTOPR DE LA SUPERCLASE
                     // EN NUESTRO CASO, LLAMA A ANIMAL()
                     // SIEMPRE DEBEMOS LLAMAR PRIMERO AL CONSTRUCTOR DE LA SUPERCLASE
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero!!");
    }
   
}


class Perros extends Mamifero{
    public Perros (){
        //SIEMPRE HAY QUE INVOCAR AL CONSTRUCTOR DE LA SUPERCLASE
        super();
        System.out.println("Soy Luna y soy un perro");
    }  
}