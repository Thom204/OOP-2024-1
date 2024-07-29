package Ej_PN18;

public class Empleado {
    private String nombre, codigo;
    private double horasSemana, valorHora, retencion;


    public Empleado(String codigo, String nombre, double horas, double valorH, double retencion){
        this.codigo= codigo;
        this.nombre= nombre;
        this.horasSemana= horas;
        this.valorHora= valorH;
        this.retencion= retencion;
    }

    public String descripcion(){
        double sBruto = horasSemana*valorHora;
        double sNeto = sBruto * (retencion/100);
        return ("codigo: "+codigo+"\nnombres: "+nombre+"\nsalario bruto: "+sBruto+"\nsalario neto: "+sNeto);
    }
}
