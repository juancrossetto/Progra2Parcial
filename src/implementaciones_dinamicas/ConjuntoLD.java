package implementaciones_dinamicas;

import API.ConjuntoTDA;

/*
 * Para implementar el conjunto, a diferencia de las otras estructuras, no hay orden,
por lo tanto la estrategia es simplemente mantener la cadena de nodos y siempre
se deber´a recorrerla para buscar un elemento o eliminarlo. Aqu´ presentamos una
implementaci´on, existen otras que mantienen la cadena ordenada. Con esto se
mejoran algunos costos y se empeoran otros.
 * */

public class ConjuntoLD implements ConjuntoTDA {

	Nodo c;

	@Override
	public void InicializarConjunto() {
		// TODO Auto-generated method stub
		c = null;

	}

	@Override
	public boolean ConjuntoVacio() {
		// TODO Auto-generated method stub
		return (c == null);
	}

	@Override
	public void Agregar(int x) {
		// TODO Auto-generated method stub
		if (!this.Pertenece(x)) {
			Nodo aux = new Nodo();
			aux.info = x;
			aux.sig = c;
			c = aux;
		}

	}

	@Override
	public int Elegir() {
		// TODO Auto-generated method stub
		return c.info;
	}

	@Override
	public void Sacar(int x) {
		// TODO Auto-generated method stub
		if (c != null) {
			// si es el primer elemento de la lista
			if (c.info == x) {
				c = c.sig;
			} else {
				Nodo aux = c;
				while (aux.sig != null && aux.sig.info != x)
					aux = aux.sig;
				if (aux.sig != null)
					aux.sig = aux.sig.sig;
			}
		}

	}

	@Override
	public boolean Pertenece(int x) {
		// TODO Auto-generated method stub
		Nodo aux = c;
		while ((aux != null) && (aux.info != x)) {
			aux = aux.sig;
		}
		return (aux != null);
	}

}
