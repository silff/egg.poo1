/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
crea un método "retirar_dinero" que permita retirar una cantidad de dinero del 
saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar
una transacción de retiro.
 */
package Guia7E_4;

import java.util.Scanner;

public class Cuenta {

    public double saldo;
    public String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirarDinero() {

        saldo = 10000;
        double retira;
        Scanner leer = new Scanner(System.in);
        System.out.println("saldo inicial " + saldo);
        do {
            System.out.println("monto a retirar");
            retira = leer.nextDouble();
            saldo -= retira;
            if (saldo < retira) {
                System.out.println("saldo insuficiente");
                System.out.println("ingrese un monto menor");
                retira = leer.nextDouble();
            }
            System.out.println("saldo disponible " + saldo);
        } while (saldo > 0);

    }
}
