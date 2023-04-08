
package MisClases;

public class Automovil {
    private String marca;
    private String modelo;
    private int fecha;
    
    public void setMarca(String n){
        marca = n;
    }
    public void setModelo(String n){
        modelo = n;
    }
    public void setFecha(int n){
        fecha = n;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getFecha(){
        return fecha;
    }
    
    public void imprimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: "+ fecha);
    }
}
