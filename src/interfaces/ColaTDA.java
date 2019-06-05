package  interfaces;

/**
Una cola es una estructura que nos permite almacenar valores, recuperar y eliminar el primer valor ingresado, ademas de que nos permite conocer si la cola tiene o no elementos. 
Por lo tanto, si analizamos la diferencia en cuanto al comportamiento de una pila y una cola, esa diferencia esta dada en la forma en que recuperan y eliminan los valores en
cada estructura.
 **/

public interface ColaTDA {

    void InicializarCola();
    //siempre que la cola este inicializada
    void Acolar(int x);
    //siempre que la cola este inicializada y no est´e vac´ıa
    void Desacolar();
    //Siempre que la cola este inicializada
    boolean ColaVacia();
    //Siempre que la cola este inicializada y no est´e vac´ıa
    int Primero();

}
