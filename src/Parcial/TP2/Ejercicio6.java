package Parcial.TP2;


import API.*;
import implementaciones_estaticas.*;
import tools.UtilidadesConjunto;

public class Ejercicio6 {

    public static void main(String[] args){

        ConjuntoTDA a=new ConjuntoTA();
        a.InicializarConjunto();

        a.Agregar(5);
        a.Agregar(10);
        a.Agregar(20);
        a.Agregar(4);
        a.Agregar(9);


        ConjuntoTDA b=new ConjuntoTA();
        b.InicializarConjunto();

        b.Agregar(20);
        b.Agregar(10);
        b.Agregar(5);
        b.Agregar(11);
        b.Agregar(33);

        ConjuntoTDA diferencia = UtilidadesConjunto.diferencia(a, b);
        System.out.println(diferencia);
    }

}
