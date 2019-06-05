/**
 * 
 */
package interfaces;

/**
 * El ultimo tipo de dato abstracto que vamos a definir en esta unidad sera el diccionario. La estructura de datos diccionario se caracteriza porque cada valor
ingresa a la estructura asociado a una clave, y est´as claves existen siempre que
tengan valor asociado y son ´unicas

El diccionario multiple tiene como caracteristica principal que cada clave del
diccionario puede tener asociado un conjunto de valores.
 *
 */
public interface DiccionarioMultipleTDA {
	void InicializarDiccionario () ;
	void Agregar( int clave , int valor);
	void Eliminar( int clave);
	void EliminarValor( int clave , int valor);
	ConjuntoTDA Recuperar( int clave);
	ConjuntoTDA Claves();
}
