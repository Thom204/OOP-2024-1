
package Ej_RN10;

import java.util.Scanner;

public class Ej_RN10 { 
    
    public static void main(String[] args) {
        
        double  patrimonio, estrato, pago_matricula;
        String nombre, n_inscripcion;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de inscripcion: ");
        n_inscripcion = entrada.nextLine();

        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el patrimonio del estudiante: ");
        patrimonio = entrada.nextDouble();

        System.out.println("Ingrese el estrato del estudiante: ");
        estrato = entrada.nextDouble();
        
        CalculadoraMatricula c = new CalculadoraMatricula(patrimonio, estrato);
        pago_matricula = c.calcular()    ;

        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION: " + n_inscripcion + " Y NOMBRE: " + nombre + " DEBE PAGAR: $" + pago_matricula);
        
        entrada.close();

    }
}