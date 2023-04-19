/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un
empleado en función de su edad y salario actual. El aumento salarial debe ser del 
10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Guia7E_5;

import java.util.Scanner;

public class Empleado {
    
    public String nombre;
    public int edad;
    public double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcularAumento() {
        double aumento;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        nombre = leer.nextLine();
        System.out.println("edad");
        edad = leer.nextInt();
        System.out.println("ingrese salrio");
        salario = leer.nextDouble();
        
        if (edad < 30) {
            aumento = salario * 0.05;   
            
        } else {
            aumento = salario * 0.1;
        }
        
        System.out.println("empleado " + nombre + " aumento " +  "$" + aumento);
    }
}
