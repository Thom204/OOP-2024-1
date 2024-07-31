
package ej_rn10;


public class CalculadoraMatricula {
    double patrimonio, matricula =50000, estrato;

    public CalculadoraMatricula(double _patrimonio, double _estrato) {
        this.patrimonio = _patrimonio;
        this.estrato = _estrato;
    }

    double calcular() {
        if (patrimonio > 2000000 && estrato > 3) {
            matricula = matricula + (patrimonio * 0.03);
        }
        return matricula;
    }
}

