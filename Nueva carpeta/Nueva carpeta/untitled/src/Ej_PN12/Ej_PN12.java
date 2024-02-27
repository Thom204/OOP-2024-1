package Ej_PN12;

public class Ej_PN12 {
    public static void main(String[] args){
        double neto, bruto, retencion;
        int horasPorMes= 48*4;
        bruto= horasPorMes*5000;
        retencion= 0.125*bruto;
        neto= bruto-retencion;

        System.out.println("Salario bruto: "+bruto+"\nRetencion en la fuente: "+retencion+"\nSalario neto: "+neto);
    }
}
