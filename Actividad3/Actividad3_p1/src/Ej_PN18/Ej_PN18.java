package Ej_PN18;
import java.util.Scanner;
public class Ej_PN18 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String nombre, codigo;
        double numHoras, valorHora, retencion;

        System.out.println("Ingrese el codigo del empleado: ");
        codigo = entrada.nextLine();

        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el numero de horas trabajadas: ");
        numHoras = entrada.nextDouble();

        System.out.println("Ingrese el valor de la hora: ");
        valorHora = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de retencion: ");
        retencion = entrada.nextDouble();

        Empleado e= new Empleado(codigo, nombre, numHoras, valorHora, retencion);
        System.out.println(e.descripcion());
    }
}
