/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un 
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas.
 */
package Guia7_1;

import java.util.Scanner;

public class Libro {
    
    //atributos
    String titulo;
    int ISBN;
    String autor;
    int numeroPaginas;
    
    
    //constructor
    public Libro(String titulo, int ISBN, String autor, int numeroPaginas) {
        this.autor = autor;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {    
    }
    
    
    //metodos
    public void pedirDatos() {
        
        Scanner leer1 = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        Scanner leer3 = new Scanner(System.in);
        Scanner leer4 = new Scanner(System.in);
        System.out.println("ingrese titulo");
        titulo = leer1.nextLine();
        System.out.println("ingrese ISBN");
         ISBN = leer2.nextInt();
        System.out.println("ingrese autor");
        autor = leer3.nextLine();
        System.out.println("ingrese numero de paginas");
        numeroPaginas = leer4.nextInt();
        
    }
    
    public void mostrarDatos() {
        
        System.out.println("titulo " + titulo + "\nISBN " + ISBN + "\nautor " + autor + "\npaginas " + numeroPaginas);
    }
}
