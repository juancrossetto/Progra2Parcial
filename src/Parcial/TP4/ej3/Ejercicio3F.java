package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;
import tools.UtilidadesArbolBinario;

public class Ejercicio3F {

    //Calcular la suma de los elementos que contiene un ABB.
    public static void main(String[] args) {

        ABBTDA a = new ABB();

        a.InicializarArbol();


        a.AgregarElem(100);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);

        int suma = UtilidadesArbolBinario.sumarElementos(a);

        System.out.println("Elementos sumados: " + suma);

    }

}
