package tools;

import API.*;
import implementaciones_estaticas.PilaTF;

public class UtilidadesPila {


    public static void PasarCola(ColaTDA origen, ColaTDA destino){
        while(!origen.ColaVacia()){
            destino.Acolar(origen.Primero());
            origen.Desacolar();
        }
    }

    public static void PasarPila(PilaTDA origen, PilaTDA destino){
        while(!origen.PilaVacia()){
            destino.Apilar(origen.Tope());
            origen.Desapilar();
        }
    }

    public static void CopiarPila(PilaTDA o, PilaTDA d){

        PilaTDA aux=new PilaTF();
        aux.InicializarPila();

        PasarPila(o,aux);

        while(!aux.PilaVacia()){
            d.Apilar(aux.Tope());
            o.Apilar(aux.Tope());
            aux.Desapilar();
        }
    }

    public static void ImprimirPila(PilaTDA a) {
        PilaTDA aux=new PilaTF();
        aux.InicializarPila();
        CopiarPila(a,aux);
        while(!aux.PilaVacia()){
            System.out.println(aux.Tope());
            aux.Desapilar();
        }
    }
}
