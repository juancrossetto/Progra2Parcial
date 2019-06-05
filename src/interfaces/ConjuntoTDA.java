/**
 * 
 */
package interfaces;

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

	void InicializarConjunto();
	// siempre que el conjunto este inicializado
	boolean ConjuntoVacio();
	// siempre que el conjunto este inicializado
	void Agregar(int x);
	// siempre que el conjunto este inicializado y no este vaco
	int Elegir();
	// siempre que el conjunto este inicializado
	void Sacar(int x);
	// siempre que el conjunto este inicializado
	boolean Pertenece( int x);

}
