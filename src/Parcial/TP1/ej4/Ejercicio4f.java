package Parcial.TP1.ej4;

import API.ColaTDA;
import implementaciones_estaticas.*;
import tools.UtilidadesCola;

public class Ejercicio4f {

	 /*Determinar si la Cola C1 es la inversa de la Cola C2. Dos Colas serán
	inversas, si tienen los mismos elementos pero en orden inverso.*/
    public static void main(String[] args){


        //invierto la cola c1 y despues comparo todos los elementos para ver si son iguales
        ColaTDA c1 = new ColaPI();
        ColaTDA c2 = new ColaPI();

        c1.InicializarCola();
        c1.Acolar(3);
        c1.Acolar(2);
        c1.Acolar(1);
        
        c2.InicializarCola();
        c2.Acolar(1);
        c2.Acolar(2);
        c2.Acolar(3);


        ColaTDA aux = new ColaPI();
        aux.InicializarCola();

        UtilidadesCola.CopiarInvertiendo(c1,aux);


        System.out.println("");

        while(!c2.ColaVacia() && !aux.ColaVacia() && (c2.Primero()==aux.Primero())){
            c2.Desacolar();
            aux.Desacolar();
        }


        if(c2.ColaVacia() && aux.ColaVacia()){
            System.out.println("C1 es inversa de c2");
        }else{
            System.out.println("C1 no es la inversa de c2");
        }
    }
}
