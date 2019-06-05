package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;


public class Ejercicio3E {

    //Calcular la cantidad de elementos que contiene un ABB.
    public static void main(String[] args) {

        ABBTDA a = new ABB();

        a.InicializarArbol();


        a.AgregarElem(100);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);


        int menor = Ejercicio3E.contarElementos(a);

        System.out.println("Elementos contados:" + menor);

    }

    public static  int contarElementos(ABBTDA t) {
        if (t.ArbolVacio()) {
            return 0;
        }  else {
            return (1 + contarElementos(t.HijoIzq()) + contarElementos(t.HijoDer()));
        }
    }
}
