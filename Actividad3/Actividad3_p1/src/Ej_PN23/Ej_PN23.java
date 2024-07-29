
package Ej_PN23;

import java.util.Scanner;

public class Ej_PN23 {


    public static void main(String[] args) {
        double a, b, c;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el coheficiente a: ");
        a = entrada.nextDouble();

        System.out.println("Ingrese el coheficiente b: ");
        b = entrada.nextDouble();

        System.out.println("Ingrese el coheficiente c: ");
        c = entrada.nextDouble();

        System.out.println(new FromulaEstudiante(a,b,c).factorizar());

        entrada.close();
    }
}

