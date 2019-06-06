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

        int elemento = 16;
        boolean existe = UtilidadesArbolBinario.existeElementoEnABB(a, elemento);

        
        if(existe)
        	System.out.println("El elemento " + elemento + " existe en el siguiente arbol");
        else 
        	System.out.println("El elemento " + elemento + " NO existe en el siguiente arbol");

        
        UtilidadesArbolBinario.InOrder(a);

    }

}
