package implementaciones_estaticas;

import interfaces.ColaTDA;

/*
 * Primer elemento ingresado a la cola en la posici´on inicial del
arreglo: Implementaci´on en donde se guardan los datos en un arreglo y adem´as
se tiene una variable que indica la cantidad de elementos que se tienen guardados
en la cola. Cuando agregamos un nuevo elemento a la cola, el mismo se guarda
en la posici´on indicada por la variable que guarda la cantidad de elementos que
tiene la cola hasta el momento. Cuando se tiene que desacolar un elemento de
la cola se requiere un corrimiento a izquierda en una posici´on de los elementos que se encuentran en la cola.
 * */

public class ColaPI implements ColaTDA {
	
	int [] a ;
	int indice;


	@Override
	public void InicializarCola() {
		// TODO Auto-generated method stub
		a = new int [100];
		indice = 0;
		
	}

	@Override
	public void Acolar(int x) {
		// TODO Auto-generated method stub
		a[ indice] = x;
		indice++;

		
	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub
		for ( int i = 0; i < indice -1; i ++)
		a[i] = a[i +1];
		indice --;

		
	}

	@Override
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return ( indice == 0) ;

	}

	@Override
	public int Primero() {
		// TODO Auto-generated method stub
		return a [0];
	}

}
