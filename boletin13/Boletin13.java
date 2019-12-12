
package boletin13;


public class Boletin13 {

        public static void main(String[] args) {
        Jugador jug1=new Jugador("Delantero",1,"Pedro","Martinez",23);
        Entrenador ent=new Entrenador("A25",0,"Juan","Gonzalez",56);
        Masajista mas=new Masajista("Fisioterapeuta",10,12,"Martin","Pescador",50);
        System.out.println(jug1);
        System.out.println(ent);
        System.out.println(mas);
        jug1.separador();
        Seleccion jug2=new Jugador("Portero",2,"Pepito","Grillo",30);
        System.out.println(jug2);
        jug1.separador();
        jug1.concentrarse();
        ent.concentrarse();
        mas.concentrarse();
        jug2.concentrarse();
        jug1.separador();
        jug1.viajar();
        ent.viajar();
        mas.viajar();
        jug2.viajar();
        jug1.separador();
        System.out.println("Edad del jugador:"+jug1.getEdad());
        Seleccion sel=new Seleccion(5,"Prueba","Rara",25);
        // falla sel.getDorsal();
        
    }
    
}