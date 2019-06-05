package implementaciones_dinamicas;

/*
 * 
 * o implementar el TDA manteniendo la cadena de nodos ordenada primero
por prioridad y luego por orden de entrada, manteniendo un puntero al elemento
con mayor prioridad, que es el primero que se deber´a eliminar.*/

import interfaces.ColaPrioridadTDA;

public class ColaPrioridadLD implements ColaPrioridadTDA {

	NodoPrioridad mayorPrioridad;

	@Override
	public void InicializarCola() {
		// TODO Auto-generated method stub
		mayorPrioridad = null;

	}

	@Override
	public void AcolarPrioridad(int x, int prioridad) {
		// TODO Auto-generated method stub
		// Creo el nuevo nodo que voy a acolar
		NodoPrioridad nuevo = new NodoPrioridad();
		nuevo.info = x;
		nuevo.prioridad = prioridad;
		// Si la cola est´a vac´a o bien es m´as prioritario que
		// el primero hay que agregarlo al principio
		if (mayorPrioridad == null || prioridad > mayorPrioridad.prioridad) {
			nuevo.sig = mayorPrioridad;
			mayorPrioridad = nuevo;
		} else {
			// Sabemos que mayorPrioridad no es null
			NodoPrioridad aux = mayorPrioridad;
			while (aux.sig != null && aux.sig.prioridad >= prioridad) {
				aux = aux.sig;
			}
			nuevo.sig = aux.sig;
			aux.sig = nuevo;
		}

	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub
		mayorPrioridad = mayorPrioridad.sig;

	}

	@Override
	public int Primero() {
		// TODO Auto-generated method stub
		return mayorPrioridad.info;
	}

	@Override
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return (mayorPrioridad == null);
	}

	@Override
	public int Prioridad() {
		// TODO Auto-generated method stub
		return mayorPrioridad.prioridad;
	}

}
