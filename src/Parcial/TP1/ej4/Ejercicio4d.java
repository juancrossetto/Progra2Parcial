package Parcial.TP1.ej4;

import API.ColaTDA;
import implementaciones_estaticas.*;
import tools.UtilidadesCola;

public class Ejercicio4d {

    //Determinar si el final de la cola c1 coincide o  no con la cola c2
    public static void main(String[] args){

        ColaTDA c1 = new ColaPI();
        ColaTDA c2 = new ColaPI();

        c1.InicializarCola();
        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(3);

        c2.InicializarCola();
        c2.Acolar(1);
        c2.Acolar(2);
        c2.Acolar(3);


        int c1Ultimo = UtilidadesCola.UltimoElemento(c1);
        int c2Ultimo = UtilidadesCola.UltimoElemento(c2);

        if(c1Ultimo==c2Ultimo){
            System.out.println("El ultimo elmenento es igual");
        }else{
            System.out.println("El ultimo elmenento no es igual");
        }
    }
}
