
package Ej_PN22;

import java.util.Scanner;

public class Ej_PN22 {


    public static void main(String[] args)  {
        String nombre;
        double horas, precio_hora, salario;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese el precio por hora: ");
        precio_hora = sc.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas = sc.nextDouble();

        salario = precio_hora * horas;

        System.out.println(new Salario(salario, nombre).mostrar());

        sc.close();

    }
}

