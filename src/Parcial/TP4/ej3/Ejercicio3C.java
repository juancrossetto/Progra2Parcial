package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.*;
import tools.UtilidadesArbolBinario;

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

        /*La profundidad es, dado un elemento, la altura desde la raiz a ese 
       elemento(sin contar ese elemento), si el elemento es raiz, la prof seria 0*/
        int profundidad = UtilidadesArbolBinario.calcularProfundidad(a, 15);
        System.out.println("La profundidad es: "+ profundidad);
    }

    
}
