package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;

public class Ejercicio3B {

    //Dado un elemento, determinar si es una hoja de un ABB.
    public static void main(String[] args){

        ABBTDA a=new ABB();

        a.InicializarArbol();


        a.AgregarElem(100);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);


        boolean esHoja = Ejercicio3B.esHoja(a, 15);

        System.out.println("Es hoja:"+esHoja);

    }

    public static boolean esHoja(ABBTDA t, int x) {
        if (t.ArbolVacio()) {
            return false;
        } else if (t.Raiz()==x && (t.HijoDer().ArbolVacio() && t.HijoIzq().ArbolVacio())) {
            return true;
        }
        if (t.Raiz() > x) {
            return esHoja(t.HijoIzq(), x);
        } else {
            return esHoja(t.HijoDer(), x);
        }
    }
}
