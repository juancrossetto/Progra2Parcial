/**
 * 
 */
package API;

/**
 * El conjunto es una estructura que nos permite guardar elementos sin que los
 * mismos se repitan y en donde no se tiene un orden, y adem´as nos permite
 * conocer si un elemento dado se encuentra o pertenece a la estructura. Debido
 * a que la estructura no tiene un orden, cuando recuperamos un dato la
 * estructura nos devuelve uno cualquiera que pertenece a ella, y por otro lado
 * cuando queremos eliminar una valor debemos indicarle cual es
 *
 */
public interface ConjuntoTDA {

	void InicializarConjunto ();
	// siempre que el conjunto estee inicializado
	//Determino las variables para usar en el conjunto y las pongo en su valor minimo
	
	boolean ConjuntoVacio();
	// siempre que el conjunto este inicializado
	//Devuelve true si no tiene nodos con valores en el conjunto, si no false
	
	void Agregar(int x);
	// siempre que el conjunto este inicializado y no este vacio
	//Agrega un nodo con valor en el conjunto, si este valor no existe 
	
	int Elegir();
	// siempre que el conjunto este inicializado
	//Devuelve el valor de su ultimo nodo agregado
	
	void Sacar(int x);
	// siempre que el conjunto este inicializado y no vacio
	//elimina el nodo que tiene ese valor
	
	boolean Pertenece(int x);
	// siempre que el conjunto este inicializado y no vacio
	//devuelve true si el valor recibido existe en el conjunto

}
