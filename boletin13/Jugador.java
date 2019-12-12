
package boletin13;

public class Jugador extends Seleccion{
    private String demarcacion;

    public Jugador() {
    }
    public Jugador(String demarcacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void jugarPartido(){
        System.out.println("Juega Partido");
    }
    public void entrenar(){
        System.out.println("Entrena");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja el jugador");
    }
    @Override
    public String toString() {
        return super.toString()+", Demarcacion." + demarcacion;
    }
}
