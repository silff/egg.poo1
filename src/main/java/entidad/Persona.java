/*
 */
package entidad;

public class Persona {
    
    
    //atributos
    String nombre;
    int edad;
    int DNI;
    
    
    //constructor
    public Persona(String nombre, int edad, int DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }
    
    public Persona() {
        
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
}
