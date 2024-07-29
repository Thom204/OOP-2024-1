package Ej_PN19;
import java.util.Scanner;
public class Ej_PN19 {
    public static void main(String[] args) {
        double lado;
        double perimetro, altura, area;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el lado del Triangulo: ");
        lado = entrada.nextDouble();

        Triangulo T = new Triangulo(lado);

        perimetro = T.perimetro();

        altura = T.altura();

        area = T.area();

        System.out.println("El perimetro del Triangulo es: " + perimetro);
        System.out.println("La altura del Triangulo es: " + altura);
        System.out.println("El area del Triangulo es: " + area);
        entrada.close();
    }
}
