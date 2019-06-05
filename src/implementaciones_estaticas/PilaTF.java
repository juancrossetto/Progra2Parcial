package  implementaciones_estaticas;

import interfaces.PilaTDA;

/*
 * Estrategia 1: Implementaci´on en donde se guardan los datos en un arreglo y
adem´as se tiene una variable que indica la cantidad de elementos que se tienen
guardados en la pila. Cuando agregamos un nuevo elemento a la pila, el mismo
se guarda en la posici´on indicada por la variable que me indica la cantidad de
elementos. Cuando se tiene que desapilar un elemento de la pila, solo es necesario
decrementar en una unidad la variable que me indica la cantidad de elementos.
 * */

public class PilaTF implements PilaTDA  {

    int [] a ; // arreglo en donde se guarda la informaciÂ´on
    int indice; // variable entera en donde se guarda la cantidad de elementos que se tienen guardados

    //@java.lang.Override
    public void InicializarPila() {
        a = new int[100];
        indice = 0;
    }

    //@java.lang.Override
    public void Apilar(int x) {
        a[indice] = x;
        indice ++;
    }

    //@java.lang.Override
    public void Desapilar() {
        indice --;
    }

    //@java.lang.Override
    public boolean PilaVacia() {
        return (indice == 0);
    }

    //@java.lang.Override
    public int Tope() {
        return a[ indice -1];

    }
}
