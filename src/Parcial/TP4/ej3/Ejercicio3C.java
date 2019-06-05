package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;

public class Ejercicio3C {

    //Dado un elemento, calcular su profundidad en el ABB.
    public static void main(String[] args){

        ABBTDA a=new ABB();

        a.InicializarArbol();


        a.AgregarElem(100);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);


        int profundidad = Ejercicio3C.calcularProfundidad(a, 15);

        System.out.println("La profundidad es:"+profundidad);

    }

    public static  int calcularProfundidad(ABBTDA t, int x) {
        if (t.ArbolVacio()) {
            return 0;
        } else if (t.Raiz()==x) {
            return 0;
        }
        if (t.Raiz() > x) {
            return (1 + calcularProfundidad(t.HijoIzq(), x));
        } else {
            return (1 + calcularProfundidad(t.HijoDer(), x));
        }
    }
}
