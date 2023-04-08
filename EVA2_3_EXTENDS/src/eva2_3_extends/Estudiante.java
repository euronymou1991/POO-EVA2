
package eva2_3_extends;
  // CLASE DERIVADA extends CLASE BASE
  // CLASE HIJO extends CLASE PADRE
  // SUBCLASE extends SUPERCLASE

public class Estudiante extends Persona{
    private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
}
