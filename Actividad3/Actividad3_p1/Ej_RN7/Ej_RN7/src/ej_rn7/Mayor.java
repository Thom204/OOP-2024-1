package ej_rn7;


public class Mayor {

    private double valor_a, valor_b;

    public Mayor(double _valor_a, double _valor_b) {
        this.valor_a = _valor_a;
        this.valor_b = _valor_b;
    }
    String mayor() {
        if (valor_a > valor_b) {
            return (valor_a + " es mayor que "+  valor_b);
        } else if (valor_a == valor_b) {
            return (valor_a + " es igual que "+  valor_b);
        } else {
            return (valor_a + " es menor que "+  valor_b);
        }
    }
    
}