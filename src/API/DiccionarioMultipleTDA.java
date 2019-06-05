/**
 * 
 */
package API;

/**
 * El ultimo tipo de dato abstracto que vamos a definir en esta unidad sera el diccionario. La estructura de datos diccionario se caracteriza porque cada valor
ingresa a la estructura asociado a una clave, y est´as claves existen siempre que
tengan valor asociado y son ´unicas

El diccionario multiple tiene como caracteristica principal que cada clave del
diccionario puede tener asociado un conjunto de valores.
 *
 */
public interface DiccionarioMultipleTDA {
	
	public void InicializarDiccionario();
	//Determino las variables para usar en el diccionario y las pongo en su valor minimo
	
	public void Agregar(int clave, int valor); // siempre que este inicializado.
	//con la clave agrego el valor en el conjunto, si ya existe el valor no hago nada
	
	public void Eliminar(int clave); // siempre que este inicializado.
	//Tomando el valor de la clave elimino todos sus valores que esten asociados y despues la misma clave
	
	public void EliminarValor(int clave, int valor); // siempre que este inicializado.
	//elimino el valor que esta asociado a la clave, si la clave se queda sin valores la elimino tambien
	
	public ConjuntoTDA Recuperar(int clave); // siempre que este inicializado.
	//devuelve el conjunto de valores que esten asociados a esa clave
	
	public ConjuntoTDA Claves(); // siempre que este inicializado.
	//devuelve todas las claves en el diccionario
}
