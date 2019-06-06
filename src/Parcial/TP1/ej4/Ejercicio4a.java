package Parcial.TP1.ej4;

import API.*;
import implementaciones_estaticas.*;
import tools.UtilidadesCola;


public class Ejercicio4a {

    //Pasar una cola a otra
    public static void main(String[] args){

    	
        ColaTDA origen = new ColaPU();
        ColaTDA destino = new ColaPU();


        origen.InicializarCola();
        origen.Acolar(1);
        origen.Acolar(2);
        origen.Acolar(3);

        destino.InicializarCola();
        
        
        UtilidadesCola.PasarCola(origen,destino);

        System.out.println("Cola destino");
        UtilidadesCola.ImprimirCola(destino);

    }
}
