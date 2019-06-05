package  API;

/**
Una cola es una estructura que nos permite almacenar valores, recuperar y eliminar el primer valor ingresado, ademas de que nos permite conocer si la cola tiene o no elementos. 
Por lo tanto, si analizamos la diferencia en cuanto al comportamiento de una pila y una cola, esa diferencia esta dada en la forma en que recuperan y eliminan los valores en
cada estructura.
 **/

public interface ColaTDA {

	void InicializarCola();
	// siempre que la cola este inicializada
	//Determino las variables para usar en la cola y las pongo en su valor minimo
	
	void Acolar(int x);
	// siempre que la cola este inicializada y no este vacia
	//Creo un nuevo nodo, lo ubico despues del ultimo y despues lo llamo ultimo
	
	void Desacolar() ;
	// siempre que la cola este inicializada
	//Tomo el ultimo nodo y hago que apunte al siguiente
	
	boolean ColaVacia();
	// siempre que la cola este inicializada y no este vacia
	//Devuelve true si no tiene nodos con valores en la cola, si no false
	
	int Primero();
	// siempre que la cola este inicializada y no este vacia
	// devuelve el valor que esta en el nodo origen

}
