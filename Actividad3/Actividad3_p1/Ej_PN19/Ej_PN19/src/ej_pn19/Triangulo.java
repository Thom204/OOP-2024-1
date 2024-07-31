package ej_pn19;


public class Triangulo {
    double lado;

    public Triangulo(double _lado) {
        this.lado = _lado;
    }
    double perimetro() {
        return lado * 3;
    }
    double altura() {
        return (Math.sqrt(3) / 2) * lado;
    }
    double area() {
        return (Math.sqrt(3)  * Math.pow(lado,2))/4;
    }
}
