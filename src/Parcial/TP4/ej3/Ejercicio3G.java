package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;

public class Ejercicio3G {

    //Calcular el cantidad de hojas de un ABB.
    public static void main(String[] args) {

        ABBTDA a = new ABB();

        a.InicializarArbol();


        a.AgregarElem(100);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);
        a.AgregarElem(5);


        int hojas = Ejercicio3G.calcularCantidadHojas(a);

        System.out.println("Cantidad de hojas:" + hojas);

    }

    public static  int calcularCantidadHojas(ABBTDA t) {
        if (t.ArbolVacio()) {
            return 0;
        }  else if (t.HijoIzq().ArbolVacio() && t.HijoDer().ArbolVacio()) {
            return 1;
        }else {
            return calcularCantidadHojas(t.HijoIzq()) + calcularCantidadHojas(t.HijoDer());
        }
    }
}
