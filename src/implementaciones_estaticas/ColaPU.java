package implementaciones_estaticas;

import API.ColaTDA;

/*
 * Ultimo elemento ingresado a la cola en la posici´on inicial d ´ el
arreglo: Implementaci´on en donde se guardan los datos en un arreglo y adem´as
se tiene una variable que indica la cantidad de elementos que se tienen guardados
en la cola. Cuando agregamos un nuevo elemento a la cola, el mismo se guarda
en la posici´on cero del arreglo, por lo cual se requiere previo a la inserci´on un
corrimiento a derecha de los elementos que se encuentran en la cola. Cuando se
tiene que desacolar un elemento de la cola, solo es necesario decrementar en una
unidad la variable que me indica la cantidad de elementos.
 * */

public class ColaPU implements ColaTDA {

	int[] a;
	int indice;

	@Override
	public void InicializarCola() {
		// TODO Auto-generated method stub
		a = new int[100];
		indice = 0;

	}

	@Override
	public void Acolar(int x) {
		// TODO Auto-generated method stub
		for (int i = indice - 1; i >= 0; i--)
			a[i + 1] = a[i];
		a[0] = x;
		indice++;

	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub
		indice--;

	}

	@Override
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return (indice == 0);
	}

	@Override
	public int Primero() {
		// TODO Auto-generated method stub
		return a[indice - 1];
	}

}
