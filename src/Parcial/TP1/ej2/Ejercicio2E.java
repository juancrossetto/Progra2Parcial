package Parcial.TP1.ej2;

import API.*;
import Parcial.TP1.Tp1;
import implementaciones_estaticas.*;

public class Ejercicio2E {

    //Sumar los elementos de una Pila
    public static void main(String[] args){
        PilaTDA a=new PilaTF();
        a.InicializarPila();

        a.Apilar(1);
        a.Apilar(2);
        a.Apilar(3);

        Tp1 tp1=new Tp1();
        int elementos = tp1.SumarElementosPila(a);

        System.out.println("Suma total:"+elementos);
    }

}