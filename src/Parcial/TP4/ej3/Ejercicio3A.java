package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;
import tools.UtilidadesArbolBinario;


public class Ejercicio3A {

    //Dado un elemento, determinar si esta o no en un ABB.
    public static void main(String[] args){

        ABBTDA a=new ABB();
        a.InicializarArbol();

        a.AgregarElem(100);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);


        boolean existe = UtilidadesArbolBinario.existeElementoEnABB(a, 10);

        System.out.println("Existe elemento:"+existe);


    }

}
