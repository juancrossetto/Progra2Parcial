package implementaciones_estaticas;

import interfaces.ColaPrioridadTDA;

/*
 * Consideramos como estructuras dos arreglos, en uno de ellos
tendremos los elementos y en el otro la prioridad de cada uno de esos elementos.
Como veremos se tendr´an que mantener ambos arreglos sincronizados en cuanto
a que para una posici´on dada se tendr´a en un arreglo el valor del elemento y en
el otro la prioridad que le corresponde a ese elemento. Adem´as, como en todos
los casos que hemos trabajado con arreglos tendremos una variable en donde
llevemos la cantidad de elementos que se tienen. Se puede ver un esquema de
esta estrategia en la figura 3.2. El elemento con mayor prioridad estar´a en la
posici´on anterior a la marcada por indice.
 * 
 * 
 * */

public class ColaPrioridadDA implements ColaPrioridadTDA {
	
	int [] elementos;
	int [] prioridades;
	int indice;

	@Override
	public void InicializarCola() {
		// TODO Auto-generated method stub
		indice = 0;
		elementos = new int [100];
		prioridades = new int [100];

		
	}

	@Override
	public void AcolarPrioridad(int x, int prioridad) {
		// TODO Auto-generated method stub
		int j = indice;
		for ( ; j >0 && prioridades[j -1] >= prioridad; j -- ){
		elementos[j] = elementos[j -1];
		prioridades[ j] = prioridades[j -1];
		}
		elementos[ j] = x ;
		prioridades[j] = prioridad;
		indice++;

		
	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub
		indice --;
		
	}

	@Override
	public int Primero() {
		// TODO Auto-generated method stub
		return elementos[ indice -1];
	}

	@Override
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return ( indice == 0);
	}

	@Override
	public int Prioridad() {
		// TODO Auto-generated method stub
		return prioridades[ indice -1];
	}

}
