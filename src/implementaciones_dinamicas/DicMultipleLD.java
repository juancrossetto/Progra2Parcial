package implementaciones_dinamicas;

import API.*;

public class DicMultipleLD implements DiccionarioMultipleTDA {
	
	NodoClaveMultiple origen;

	@Override
	public void InicializarDiccionario() {
		origen = null;
	}

	@Override
	public void Agregar(int clave, int valor) {
		NodoClaveMultiple nc = Clave2NodoClaveMultpile(clave);
		if (nc == null){
			nc = new NodoClaveMultiple();
			nc.clave = clave;
			nc.sig = origen;
			origen = nc.sig;
			nc.valores = null; 
		}
		
		Nodo nv = nc.valores;
		while (nv!=null && nv.info!=valor){
			nv = nv.sig;
		}
		if (nv == null){
			nv = new Nodo();
			nv.info=valor;
			nv.sig = nc.valores;
			nc.valores = nv;
		}
	}

	private NodoClaveMultiple Clave2NodoClaveMultpile(int clave) {
		NodoClaveMultiple aux = origen;
		while (aux.clave!=clave && aux != null)
			aux = aux.sig;
		return aux;
	}

	@Override
	public void Eliminar(int clave) {
		if (origen.clave == clave)
			origen = origen.sig;
		else{
			while (origen.sig != null && origen.sig.clave!=clave){
				origen = origen.sig;
			}
			if (origen.sig != null)
				origen.sig = origen.sig.sig;
		}
	}

	@Override
	public void EliminarValor(int clave, int valor) {
		if (origen != null){
			if (origen.clave == clave){
				EliminarValorDeNodo (origen, valor);
				if (origen.valores == null){
					origen = origen.sig;
				}
			}
			else{
				NodoClaveMultiple aux = origen;
				while (aux.sig != null && aux.sig.clave != clave){
					aux = aux.sig;
				}
				if (aux.sig != null){
					EliminarValorDeNodo(aux.sig, valor);
					if (aux.sig.valores == null){
						aux.sig = aux.sig.sig;
					}
				}
			}
		}
	}

	private void EliminarValorDeNodo(NodoClaveMultiple nc, int valor) {
		if (nc.valores.info == valor){
			nc.valores = nc.valores.sig;
		}
		else{
			Nodo nv = nc.valores;
			while (nv.sig != null && nv.sig.info != valor)
				nv = nv.sig;
			if (nv.sig != null){
				nv.sig = nv.sig.sig;
			}
		}
	}

	@Override
	public ConjuntoTDA Recuperar(int clave) {
		ConjuntoTDA valores = new ConjuntoLD(); valores.InicializarConjunto();
		NodoClaveMultiple nc = Clave2NodoClaveMultpile(clave);
		if (nc != null){
			Nodo nv = nc.valores;
			while (nv != null){
				valores.Agregar(nv.info);
				nv = nv.sig;
			}
		}
		return valores;
	}

	@Override
	public ConjuntoTDA Claves() {
		ConjuntoTDA claves = new ConjuntoLD(); claves.InicializarConjunto();
		NodoClaveMultiple aux = origen;
		while (aux != null){
			claves.Agregar(aux.clave);
			aux=aux.sig;
		}
		return claves;
	}
}
