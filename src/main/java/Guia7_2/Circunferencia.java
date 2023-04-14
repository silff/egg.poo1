/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Guia7_2;

import java.util.Scanner;

public class Circunferencia {
    
    //attrib
    double radio;
    
    //construtor
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //getter y setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio");
        radio = leer.nextDouble();
    }
    
    public void area() {
        System.out.println("area  = " + Math.PI * Math.pow(radio, 2));
        
    }
    
    public void perimetro() {
        System.out.println("perimetro = " + (2*Math.PI*radio));
    }
}
