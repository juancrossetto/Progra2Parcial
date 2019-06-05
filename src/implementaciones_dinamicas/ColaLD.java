package implementaciones_dinamicas;

/*
 * Con la misma estrategia que para la pila, ahora vamos implementar la cola, esta
vez, manteniendo un puntero al primer elemento y uno al ´ultimo ya que por el
comportamiento de este TDA, se deber´a agregar por un extremo y eliminar por
el otro. El orden en que estar´an los elementos ser´a el primero apunta al segundo,
el segundo al tercero, as siguiendo, llegando al ´ultimo elemento de la cadena que
ser´a el ´ultimo elemento agregado a la Cola
 * */

import interfaces.ColaTDA;

public class ColaLD implements ColaTDA {
	
	// Primer elemento en la cola
	Nodo primero;
	// ´Ultimo elemento en la cola , es decir , el ´ultimo agregado
	Nodo ultimo;


	@Override
	public void InicializarCola() {
		// TODO Auto-generated method stub
		primero = null ;
		ultimo = null ;
	
	}

	@Override
	public void Acolar(int x) {
		// TODO Auto-generated method stub
		Nodo aux = new Nodo ();
		aux . info = x;
		aux . sig = null ;
		// Si la cola no est´a vaca
		if ( ultimo != null )
		ultimo. sig = aux ;
		ultimo = aux ;
		// Si la cola estaba vaca
		if ( primero == null )
		primero = ultimo;

		
	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub
		primero = primero. sig ;
		// Si la cola queda vaca
		if ( primero == null )
		ultimo = null ;

		
	}

	@Override
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return ( ultimo == null ) ;
	}

	@Override
	public int Primero() {
		// TODO Auto-generated method stub
		return primero.info ;
	}

}
