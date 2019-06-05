package Parcial.TP1.ej2;

import API.*;
import implementaciones_estaticas.*;
import tools.UtilidadesPila;

public class Ejercicio2B {

    public static void main(String[] args){

        PilaTDA a=new PilaTF();
        a.InicializarPila();

        PilaTDA b=new PilaTF();
        b.InicializarPila();

        a.Apilar(1);
        a.Apilar(2);
        a.Apilar(3);

        UtilidadesPila.CopiarPila(a,b);
        UtilidadesPila.ImprimirPila(b);
    }

}