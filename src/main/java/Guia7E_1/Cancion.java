/*Desarrollar una clase cancion con los siguientes aributos: titulo, autor. se 
debera definir ademas dos constructores: uno vacio que inicializa el titulo y el autor
a cadenas vacias y otro que reciba como parametros el titulo y autor de la cancion. 
Se debera ademas definir los metodos getters y setters correspondientes.
 */
package Guia7E_1;

public class Cancion {
    
    //attrib
    String titulo;
    String autor;
    
    //costrutor
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
