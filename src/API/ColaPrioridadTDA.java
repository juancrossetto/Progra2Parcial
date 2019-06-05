package API;

/*
Cada elemento cuando ingresa a la misma se le va a asignar una prioridad, y luego los elementos van a ser recuperados o eliminados
de la estructura de acuerdo a esa prioridad
A numero mas alto -> mayor prioridad
 */

public interface ColaPrioridadTDA {
	void InicializarCola ();
	// siempre que la cola este inicializada
	//Determino las variables para usar en la cola y las pongo en su valor minimo
	void AcolarPrioridad ( int x, int prioridad);
	// siempre que la cola este inicializada y no este vacia
	//Creo un nuevo nodo y lo ubico dependediendo de su valor, lo analizo con la prioridad de los demas si son iguales
	void Desacolar();
	// siempre que la cola este inicializada y no este vacia
	//Tomo el ultimo nodo y hago que apunte al siguiente
	int Primero();
	// siempre que la cola este inicializada
	//Devuelve el valor de su pruimer nodo, osea el valor de su origen
	boolean ColaVacia();
	// siempre que la cola este inicializada y no este vacia
	//Devuelve true si no tiene nodos con valores en la cola, si no false
	int Prioridad();
	//siempre que la cola este inicializada y no este vacia
	//Devuelve el valor de la prioridad de su nodo origen

}
