package Ej_PN17;
import java.util.Scanner;

public class Ej_PN17 {
    public static void main(String[] args){
        double radio, area;
        System.out.println("Ingrese el radio: ");
        Scanner sc= new Scanner(System.in);
        radio= sc.nextDouble();
        area= Math.PI*(Math.pow(radio,2));
        System.out.println("El Area del cirulo es de: "+area);
    }
}
