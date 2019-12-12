
package boletin13;

public class Seleccion {
    
 private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Seleccion (){
    }
    public Seleccion(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void concentrarse(){
        System.out.println("Se concentra la seleccion");
    }
    public void viajar(){
        System.out.println("Viaja la selección");
    }

    @Override
    public String toString() {
        return "id: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad;
    }
    public void separador(){
        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/");
    }
}