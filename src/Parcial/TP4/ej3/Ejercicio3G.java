package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;
import tools.UtilidadesArbolBinario;

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
//        a.AgregarElem(5);

        int hojas = UtilidadesArbolBinario.calcularCantidadHojas(a);

        System.out.println("Cantidad de hojas:" + hojas);

    }

    
}
