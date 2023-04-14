/*
 */
package Guia7_3;

public class OperacionesMain {

    
    public static void main(String[] args) {
        
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println("suma = " + op1.sumar());
        System.out.println("resta = " + op1.restar());
        System.out.println("multiplicacion = " + op1.multiplicar());
        System.out.println("division = " + op1.dividir());
    }
    
}
