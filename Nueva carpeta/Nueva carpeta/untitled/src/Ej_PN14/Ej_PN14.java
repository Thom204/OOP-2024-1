package Ej_PN14;
import java.util.Scanner;

public class Ej_PN14 {
    public static void main(String[]args){
        double n, n2, n3;
        System.out.println("Ingrese un numero:");
        Scanner sc= new Scanner(System.in);
        n= sc.nextDouble();
        n2= Math.pow(n,2);
        n3= Math.pow(n,3);
        System.out.println("n= "+n+"\nn^2= "+n2+"\nn^3= "+n3);
    }
}
