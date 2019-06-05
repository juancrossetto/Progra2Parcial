package Parcial.TP1.ej4;

import API.ColaTDA;
import implementaciones_estaticas.*;
import tools.UtilidadesCola;

public class Ejercicio4c {

    //Invertir el contenido de una cola(NO pueden usarse Pilas auxiliares)
    public static void main(String[] args){

        //cola origen
        ColaTDA origen = new ColaPI();

        origen.InicializarCola();
        origen.Acolar(1);
        origen.Acolar(2);
        origen.Acolar(3);

        //cola destino
        ColaTDA destino = new ColaPI();
        destino.InicializarCola();

        System.out.println("Cola origen antes de invertir");
        UtilidadesCola.ImprimirCola(origen);

        invertir(origen,destino);

        UtilidadesCola.PasarCola(destino,origen);

        System.out.println("Cola origen despues de invertir");
        UtilidadesCola.ImprimirCola(origen);

    }

    public static void invertir(ColaTDA origen,ColaTDA destino){
        if(origen.ColaVacia()) {
            return;
        }
        int primero = origen.Primero();
        origen.Desacolar();
        invertir(origen,destino);
        destino.Acolar(primero);
    }
}
