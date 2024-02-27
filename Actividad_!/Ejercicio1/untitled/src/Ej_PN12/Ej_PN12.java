package Ej_PN12;
/*
Ejercicio propuesto:
Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
la retención en la fuente y el salario neto del trabajador. */

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
