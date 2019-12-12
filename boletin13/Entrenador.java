
package boletin13;

public class Entrenador extends Seleccion{
    private String idFederacion;

    public Entrenador() {
    }
    public Entrenador(String idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirPartido(){
        System.out.println("Dirige Partido");
    }
    public void dirigirEntrenamiento(){
        System.out.println("Dirige Entrenamiento");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja el Entrenador");
    }

    @Override
    public String toString() {
        return super.toString()+", idFederacion:" + idFederacion;
    }
    
}
