package implementaciones_dinamicas;

import API.ColaTDA;

public class ColaLD implements ColaTDA {
	
	// Primer elemento en la cola
	Nodo primero;
	// Ultimo elemento en la cola , es decir , el ultimo agregado
	Nodo ultimo;


	@Override
	public void InicializarCola() {
		primero = null;
		ultimo = null;
	
	}

	@Override
	public void Acolar(int x) {
		Nodo aux = new Nodo();
		aux.info = x;
		aux.sig = null;
		// Si la cola no est� vac�a
		if (ultimo != null)
			ultimo.sig = aux;
		ultimo = aux;
		// Si la cola estaba vac�a
		if (primero == null)
			primero = ultimo;

		
	}

	@Override
	public void Desacolar() {
		primero = primero.sig;
		// Si la cola queda vac�a
		if (primero == null)
			ultimo = null;

		
	}

	@Override
	public boolean ColaVacia() {
		return (ultimo == null) ;
	}

	@Override
	public int Primero() {
		return primero.info ;
	}

}
