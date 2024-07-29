
package Ej_RN7;

import java.util.Scanner;

public class Ej_RN7 {
    public static void main(String[] args) {
        double valora, valorb;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        valora = entrada.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        valorb = entrada.nextDouble();

        Mayor caso = new Mayor(valora, valorb);
        
        System.out.println(caso.mayor());
        entrada.close();
    }
}