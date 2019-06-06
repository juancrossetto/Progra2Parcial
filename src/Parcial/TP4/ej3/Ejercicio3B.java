package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;
import tools.UtilidadesArbolBinario;

public class Ejercicio3B {

    //Dado un elemento, determinar si es una hoja de un ABB.
    public static void main(String[] args){

        ABBTDA a = new ABB();
        a.InicializarArbol();

        a.AgregarElem(100);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);


        boolean esHoja = UtilidadesArbolBinario.esHoja(a, 15);

        System.out.println("Es hoja: "+ esHoja);

    }

    
}
