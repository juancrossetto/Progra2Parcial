package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;

public class Ejercicio3D {

    //Obtener el valor del menor elemento de un ABB.
    public static void main(String[] args) {

        ABBTDA a = new ABB();

        a.InicializarArbol();


        a.AgregarElem(100);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);


        int menor = Ejercicio3D.menor(a);

        System.out.println("El menor es:" + menor);

    }

    public static int menor(ABBTDA t) {
        if (t.HijoIzq().ArbolVacio()) {
            return t.Raiz();
        } else {
            return menor(t.HijoIzq());
        }
    }
}
