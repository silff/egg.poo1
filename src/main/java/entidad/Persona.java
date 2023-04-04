/*
 */
package entidad;

public class Persona {
    public String nombre;
    public int edad;
    public int DNI;
    
    public Persona() {
        
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int edad, int DNI) {
        this.edad = edad;
        this.DNI =DNI;
    }
    
    public String getNombre(){
         return nombre;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
