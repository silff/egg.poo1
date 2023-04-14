/*
 */
package entidad;

import java.util.Scanner;

public class PersonaMain {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Persona primeraPersona = new Persona();
        primeraPersona.setDNI(213533);

        primeraPersona.setNombre("sil");
        primeraPersona.setEdad(53);
        System.out.println(primeraPersona.getEdad() + " " + primeraPersona.getDNI() + " "
                + primeraPersona.getNombre());
        System.out.println("ingrese su nombre");
        Persona segundaPersona = new Persona();
        segundaPersona.setNombre(leer.nextLine());
        System.out.println("el nombre es: " + segundaPersona.getNombre());
    }
    
}
