
package boletin13;

public class Masajista extends Seleccion{
    private String titulacion;
    private int anosExperiencia;

    public Masajista(){
    }
    public Masajista(String titulacion, int anosExperiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public void darMasaje (){
        System.out.println("Da masajes");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja el Masajista");
    }

    @Override
    public String toString() {
        return super.toString()+", Titulacion:" + titulacion + ", Años de Experiencia:" + anosExperiencia + '}';
    }
    
}
