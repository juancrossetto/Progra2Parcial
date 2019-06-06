package Parcial.TP2.ej6;


import API.*;
import implementaciones_estaticas.*;
import tools.UtilidadesConjunto;

public class Ejercicio6 {

    public static void main(String[] args){

        ConjuntoTDA a =new ConjuntoTA();
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
        
        
        ConjuntoTDA union = UtilidadesConjunto.Union(a, b);
        System.out.println("Unión:");
        UtilidadesConjunto.ImprimirConjunto(union);
        
        ConjuntoTDA interseccion = UtilidadesConjunto.Interseccion(a, b);
        System.out.println("Intersección:");
        UtilidadesConjunto.ImprimirConjunto(interseccion);

        ConjuntoTDA diferencia = UtilidadesConjunto.Diferencia(a, b);
        System.out.println("Diferencia");//La diferencia solo del conjunto origen(a).
        UtilidadesConjunto.ImprimirConjunto(diferencia);
        
        ConjuntoTDA diferenciaSimetrica = UtilidadesConjunto.DiferenciaSimetrica(a, b);
        System.out.println("Diferencia Simetrica"); //La diferencia de los 2 conjuntos
        UtilidadesConjunto.ImprimirConjunto(diferenciaSimetrica);
       
    }

}
