/**
 * 
 */
package interfaces;

/**
 * La estructura de datos diccionario se caracteriza porque cada valor
ingresa a la estructura asociado a una clave, y est´as claves existen siempre que
tengan valor asociado y son ´unicas
cada clave puede tener asociado un ´unico valor
 *
 */
public interface DiccionarioSimpleTDA {
	void InicializarDiccionario () ;
	void Agregar( int clave , int valor);
	void Eliminar( int clave);
	int Recuperar( int clave);
	ConjuntoTDA Claves();

}
