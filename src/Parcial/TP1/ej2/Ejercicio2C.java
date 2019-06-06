package Parcial.TP1.ej2;

import API.*;

import implementaciones_estaticas.*;
import tools.UtilidadesPila;

public class Ejercicio2C {

    //Invertir el contenido de una Pila
    public static void main(String[] args){
        PilaTDA a=new PilaTF();
        a.InicializarPila();

        a.Apilar(1);
        a.Apilar(2);
        a.Apilar(3);

        System.out.println("Imprimo pila antes");
        UtilidadesPila.ImprimirPila(a);

        UtilidadesPila.InvertirElementosPila(a);

        System.out.println("Imprimo pila despues");
        UtilidadesPila.ImprimirPila(a);


    }

}