package ej;

class persona {
    static void si(){

    }
    persona(){}
    persona(int a){
        this.age=a;
    }
    int age;
    void saludar() {
        System.out.println("hola");
    }
}
class empleado extends persona {

    int id;
    empleado(){
        super();
    }
    empleado(int a, int id) { //new empleado(a)
        super(a);
        this.id=id;             //new persona(a)
    }

    @Override
    void saludar() {
        System.out.println("hola señor");
    }
}

class directivo extends empleado {
    int sueldo;

    directivo(){
        super();
    }
    directivo(int a, int id) {
        super(a, id);
    }

    @Override
    void saludar() {
        System.out.println("hola empleado");
    }
}
public class ejemplo {
    public static void main(String args[] ) {
        persona p1;

        empleado e= new empleado(19,3);        //un puntero puede tener un objeto de sus subclases pero no viceversa
        directivo d= new directivo(33, 0);       //para que un puntero de menos categoria contenga un objeto de mayor tiene que se convertido
        directivo d2;

        p1=d;   //contenedor persona apunt a un objeto directivo

        int id= e.id; //se resuelve estaticamente

        p1.saludar(); //se resuelven dinamicamente

        //System.out.println(p1.getClass());

        d2= (directivo) p1;  //conversion explicita = cast //la conversion solo aplica para el puntero, NO para el objeto contenido

        d2.saludar();
    }
}