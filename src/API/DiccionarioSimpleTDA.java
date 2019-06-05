/**
 * 
 */
package API;

/**
 * La estructura de datos diccionario se caracteriza porque cada valor
ingresa a la estructura asociado a una clave, y est´as claves existen siempre que
tengan valor asociado y son unicas
cada clave puede tener asociado un ´unico valor
 *
 */
public interface DiccionarioSimpleTDA {
	public void InicializarDiccionario();
	//Determino las variables para usar en el diccionario y las pongo en su valor minimo
	
	public void Agregar (int clave, int valor); //siempre que este incializado.
	//agrego la clave con su valor respectivo, si ya existe la clave reemplazo su valor por este 
	
	public void Eliminar (int clave); // siempre que este inicializado.
	//con la clave elimino el valor y despues la misma clave
	
	public int Recuperar (int clave); // siempre que este inicializado y la clave exista en el mismo.
	//Tomando el valor de la clave, analizo su valor de dato en el diccionario y lo devuelvo 
	
	public ConjuntoTDA Claves(); // siempre que este inicializado.
	//devuelve todas las claves en el diccionario

}
