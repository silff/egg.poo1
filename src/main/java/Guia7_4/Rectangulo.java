/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. También
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará 
el rectángulo mediante asteriscos usando la base y la altura. Se deberán además
definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Guia7_4;

import java.util.Scanner;

public class Rectangulo {

    //attrib
    int base;
    int altura;

    //constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    //getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //metodos
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base");
        base = leer.nextInt();
        System.out.println("ingrese la altura");
        altura = leer.nextInt();
    }

    public int superficie() {
        return base * altura;
    }

    public int perimetro() {
        return (base + altura) * 2;
    }

    public void dibujoArea() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }

    }
    
    public void dibujoSuperficie() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
                
            }
            System.out.println("   ");
        }
    }
}
