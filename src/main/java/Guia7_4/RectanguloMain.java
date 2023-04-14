/*

 */
package Guia7_4;

public class RectanguloMain {

    public static void main(String[] args) {
       
        Rectangulo rect1 = new Rectangulo();
        rect1.crearRectangulo();
        System.out.println("superficie = " + rect1.superficie());
        rect1.dibujoSuperficie();
        System.out.println("perimetro = " + rect1.perimetro());
        rect1.dibujoArea();
    }
    
}
