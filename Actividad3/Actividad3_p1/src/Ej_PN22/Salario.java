
package Ej_PN22;


public class Salario {
    private final double salario;
    private final String nombre;

    public Salario(double _salario, String _nombre) {
        this.salario = _salario;
        this.nombre = _nombre;
    }   

    String mostrar () {
        if (salario > 450000) {
            return ("soy "+nombre + ", devengo un salario de $" + salario);
        } else {
            return (nombre);
        }
    }
}

