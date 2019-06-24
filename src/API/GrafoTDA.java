package API;

public interface GrafoTDA {

	public void InicializarGrafo();
	// siempre que el grafo este inicializado y no exista el nodo
	//Determino las variables para usar en el grafo y las pongo en su valor minimo
	public void AgregarVertice(int v);
	// siempre que el grafo este inicializado y exista el nodo
	// creo un nodo vertice y lo inserto al inicio de la lista de nodos
	public void EliminarVertice(int v) ;
	// siempre que el grafo este inicializado
	//Se recorre la lista de vertices para remover el nodo v y las aristas con este vertice.
	public ConjuntoTDA Vertices();
	// siempre que el grafo este inicializado , no exista la arista , pero existan ambos nodos
	//devuelve el conjunto de vertices del grafo 
	public void AgregarArista(int v1, int v2, int peso);
	// siempre que el grafo este inicializado y exista la arista
	//Agrego la nueva arista al inicio de la lista de nodos adyacentes al nodo origen
	public void EliminarArista(int v1, int v2);
	// siempre que el grafo este inicializado y existan los nodos
	// se elimina la arista que tiene como inicio el v1 y final el v2
	public boolean ExisteArista(int v1, int v2);
	// siempre que el grafo este inicializado y exista la arista
	// devuelve true si existe una arista que empiece en v1 y termine en v2 
	public int PesoArista(int v1, int v2);
	// siempre que el grafo este inicializado y exista la arista
	//devuele el valor del peso entre el v1 y el v2
}
