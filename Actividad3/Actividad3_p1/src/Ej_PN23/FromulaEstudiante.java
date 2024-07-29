
package Ej_PN23;

public class FromulaEstudiante {
    double a, b, c;
    double x1, x2, discriminante;

    public FromulaEstudiante(double _a, double _b, double _c) {
        this.a = _a;
        this.b = _b;
        this.c = _c;
    }

    String factorizar(){
        discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante > 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return ("Las raices son: " + x1 + " y " + x2);
        } else if (discriminante == 0) {
            x1 = -b / (2 * a);
            return ("La raiz es: " + x1);
        } else {
            return ("No tiene raices reales");
        }
    }
}
