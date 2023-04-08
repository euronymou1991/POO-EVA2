
package MisClases;

public class Television {
    private int canal;
    private int vol;
    private boolean power;
    
    public void setCanal(int n){
        canal = n;
    }
    public void setVol(int n){
        vol = n;
    }
    public void setPower(boolean n){
        power = n;
    }
    
    public int getCanal(){
        return canal;
    }
    public int getVol(){
        return vol;
    }
    public boolean getPower(){
        return power;
    }
    
    public void imprimirDatos(){
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + vol);
        System.out.println("Power: " + power);
    }
}
