/*
 */
package Guia7E_1;

//import java.util.Scanner;

public class CancionMain {

    public static void main(String[] args) {
      
        Cancion tema1 = new Cancion("azul", "cristian castro");
       // Scanner leer = new Scanner(System.in);
        
        System.out.println(tema1.autor + " " + tema1.titulo);
        
        Cancion tema2 = new Cancion();
        tema2.setTitulo("despacito");
        tema2.setAutor("fonsi");
        
        System.out.println("titulo: " + tema2.getTitulo() + " autor: " + tema2.getAutor());
    }
    
    
}
