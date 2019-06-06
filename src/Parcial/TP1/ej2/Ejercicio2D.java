package Parcial.TP1.ej2;

import API.*;
import implementaciones_estaticas.*;
import tools.UtilidadesPila;

public class Ejercicio2D {

    //Contar los elementos de una Pila
    public static void main(String[] args){
        PilaTDA a=new PilaTF();
        a.InicializarPila();

        a.Apilar(1);
        a.Apilar(2);
        a.Apilar(3);

        int elementos = UtilidadesPila.ContarElementosPila(a);

        System.out.println("Elementos:"+elementos);
    }

}