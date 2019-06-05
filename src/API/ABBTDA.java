package API;

public interface ABBTDA {
	
	public int Raiz (); // arbol inicializado, no vacio
	//Devuelve el valor que esta en el nodo raiz
	
	public ABBTDA HijoIzq (); // arbol inicializado, no vacio
	//Devuelve el arbol hijo izquierdo del arbol original si existe 
	
	public ABBTDA HijoDer (); // arbol inicializado, no vacio
	//Devuelve el arbol hijo izqu del arbol original si existe
	
	public boolean ArbolVacio(); // arbol inicializado
	//Devuelve verdadero si el nodo raiz no esta inicializado
	
	public void InicializarArbol();
	//Tomamos el nodo raiz y lo ponemos en null para poder darle valores
	
	public void AgregarElem (int x); // arbol inicializado 
	//Agrega un elemento en la ultima hoja dependiendo del valor si es mayor o menor, e inicializa los hijos 
	
	public void EliminarElem (int x); // arbol inicializado
	//Elimina el valor si es hoja, si no reemplaza por el mayor de los menores o el menor de los mayores y elimina
}
