package  API;

/**
La pila es una estructura que permite almacenar conjuntos de valores, eliminarlos y recuperarlos, con la particularidad de que el
elemento que se recupera o elimina es el ultimo que ingreso.
 **/

public interface PilaTDA {

	void InicializarPila();
	// siempre que la pila este inicializada
	//Determino las variables para usar en la pila y las pongo en su valor minimo
	
	void Apilar(int x);
	// siempre que la pila este inicializada y no este vacia
	//Creo un nuevo nodo y lo ubico arriba del primero y lo llamo tope
	
	void Desapilar();
	// siempre que la pila este inicializada
	//elimino el nodo tope
	
	boolean PilaVacia();
	// siempre que la pila este inicializada y no este vacia
	//Devuelve true si no tiene nodos con valores en la pila, si no false
	
	int Tope();
	// siempre que la pila este inicializada y no este vacia
	//devuelve el valor del nodo que esta primero
}
