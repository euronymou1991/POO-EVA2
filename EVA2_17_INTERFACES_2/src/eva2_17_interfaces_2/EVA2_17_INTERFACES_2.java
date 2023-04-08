
package eva2_17_interfaces_2;


public class EVA2_17_INTERFACES_2 {


    public static void main(String[] args) {
       
        
    }
    
}

interface IntA{
    void A();//equivale a public abstract void A();
}

interface IntB{
    public abstract void B();//equivale a void B();
}

interface IntC extends IntA,IntB{
    public abstract void C();
}

class Prueba implements IntC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
    }
    
}