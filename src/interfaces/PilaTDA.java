package  interfaces;

/**
La pila es una estructura que permite almacenar conjuntos de valores, eliminarlos y recuperarlos, con la particularidad de que el
elemento que se recupera o elimina es el ultimo que ingreso.
 **/

public interface PilaTDA {

    void InicializarPila();
    // siempre que la pila este inicializada
    void Apilar( int x);
    // siempre que la pila este inicializada y no este vacia
    void Desapilar();
    // siempre que la pila este inicializada
    boolean PilaVacia();
    //siempre que la pila este inicializada y no este vacia
    int Tope();
}
