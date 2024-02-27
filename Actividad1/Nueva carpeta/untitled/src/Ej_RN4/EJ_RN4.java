package Ej_RN4;
import java.util.Scanner;

public class EJ_RN4 {
    public static void main(String[] args) {
        double EdJuan=9;  //Edjuan= some number
        double EdAlber=(2*EdJuan)/3;
        double EdAna= (4*EdJuan)/3;
        double EdMama= EdJuan+EdAlber+EdAna;

        System.out.println("LAS EDADES SON:"+
                "\nALBERTO= "+EdAlber+
                "\nJUAN= "+EdJuan+
                "\nANA= "+EdAna+
                "\nMAMA= "+EdMama);
    }
}