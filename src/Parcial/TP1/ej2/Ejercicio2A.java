package Parcial.TP1.ej2;

import API.PilaTDA;
import implementaciones_estaticas.PilaTF;
import tools.UtilidadesPila;

public class Ejercicio2A {

    public static void main(String[] args){

        PilaTDA a=new PilaTF();
        a.InicializarPila();

        PilaTDA b=new PilaTF();
        b.InicializarPila();

        a.Apilar(1);
        a.Apilar(2);
        a.Apilar(3);

        UtilidadesPila.PasarPila(a,b);
    }

}
