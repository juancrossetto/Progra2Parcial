package tools;

import API.ConjuntoTDA;
import implementaciones_estaticas.*;

public class UtilidadesConjunto {


    public static ConjuntoTDA Interseccion(ConjuntoTDA origen, ConjuntoTDA destino){

        ConjuntoTDA interseccion=new ConjuntoTA();
        interseccion.InicializarConjunto();

        ConjuntoTDA auxOrigen=new ConjuntoTA();
        auxOrigen.InicializarConjunto();

        ConjuntoTDA auxDestino=new ConjuntoTA();
        auxDestino.InicializarConjunto();

        CopiarConjunto(origen,auxOrigen);
        CopiarConjunto(destino,auxDestino);

        while(!auxOrigen.ConjuntoVacio()) {
            int elemento = auxOrigen.Elegir();
            if(auxDestino.Pertenece(elemento)){
                interseccion.Agregar(elemento);
            }
        }

        return interseccion;
    }

    public static ConjuntoTDA Union(ConjuntoTDA origen, ConjuntoTDA destino){

        ConjuntoTDA union=new ConjuntoTA();
        union.InicializarConjunto();

        ConjuntoTDA auxOrigen=new ConjuntoTA();
        auxOrigen.InicializarConjunto();

        ConjuntoTDA auxDestino=new ConjuntoTA();
        auxDestino.InicializarConjunto();

        CopiarConjunto(origen,union);
        CopiarConjunto(destino,union);

        return union;
    }

    //Esto seria diferencia simetrica. Tengo que hacer la diferencia de A a Bt
    public static ConjuntoTDA diferencia(ConjuntoTDA origen, ConjuntoTDA destino){

        ConjuntoTDA diferencia =new ConjuntoTA();
        diferencia.InicializarConjunto();

        ConjuntoTDA auxOrigen=new ConjuntoTA();
        auxOrigen.InicializarConjunto();

        ConjuntoTDA auxDestino=new ConjuntoTA();
        auxDestino.InicializarConjunto();

        CopiarConjunto(origen,auxOrigen);
        CopiarConjunto(destino,auxDestino);

        while(!auxOrigen.ConjuntoVacio() && !auxDestino.ConjuntoVacio()){

            int elementoDestino = auxDestino.Elegir();
            int elementoOrigen = auxOrigen.Elegir();

            if(!auxOrigen.Pertenece(elementoDestino)){
                diferencia.Agregar(elementoDestino);
            }

            //auxOrigen.Sacar(elementoOrigen); solo elimino a uno de los dos, el otro no lo toco
            auxDestino.Sacar(elementoDestino);
        }

        //si agrego esto es diferencia simetrica
        /*while(!auxOrigen.ConjuntoVacio()){
            int elementoOrigen = auxOrigen.Elegir();

            diferencia.Agregar(elementoOrigen);
            auxOrigen.Sacar(elementoOrigen);
        }

        while(!auxDestino.ConjuntoVacio()){
            int aux = auxDestino.Elegir();
            diferencia.Agregar(aux);
            auxDestino.Sacar(aux);
        }
*/
        return diferencia;
    }

    public static void CopiarConjunto(ConjuntoTDA origen, ConjuntoTDA destino){
        ConjuntoTDA aux=new ConjuntoTA();
        aux.InicializarConjunto();

        while(!origen.ConjuntoVacio()){
            int elemento = origen.Elegir();
            aux.Agregar(elemento);
            destino.Agregar(elemento);
            origen.Sacar(elemento);
        }

        while(!aux.ConjuntoVacio()){
            int elegir = aux.Elegir();
            origen.Agregar(elegir);
            aux.Sacar(elegir);
        }
    }

    public static void ImprimirConjunto(ConjuntoTDA origen){

        ConjuntoTDA aux=new ConjuntoTA();
        aux.InicializarConjunto();

        CopiarConjunto(origen,aux);

        while(!aux.ConjuntoVacio()) {
            int elegir = aux.Elegir();
            System.out.println(elegir);
            aux.Sacar(elegir);
        }

    }

}
