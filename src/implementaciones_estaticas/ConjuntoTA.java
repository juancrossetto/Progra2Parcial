package implementaciones_estaticas;

import interfaces.ConjuntoTDA;

/*
 * A continuaci´on vamos a llevar a cabo la implementaci´on del TDA de conjuntos,
a partir de la utilizaci´on de un arreglo. En el caso del conjunto debido a que los
elementos no tienen un orden, cuando se elimina una elemento se puede colocar
el ´ultimo elemento que se encuentra en el arreglo en la posici´on del elemento
a eliminar, y de esta manera evitar el desplazamiento de todos los elementos.
Para implementar el m´etodo Elegir, dado que la especificaci´on no indica cu´al
es el elemento a recuperar, vamos a recuperar el elemento que est´a en la primera
posici´on del arreglo.
 * 
 * 
 * */

public class ConjuntoTA implements ConjuntoTDA {
	
	int [] a ;
	int cant ;


	@Override
	public void InicializarConjunto() {
		// TODO Auto-generated method stub
		a = new int [100];
		cant = 0;
		
	}

	@Override
	public boolean ConjuntoVacio() {
		// TODO Auto-generated method stub
		return cant == 0;

	}

	@Override
	public void Agregar(int x) {
		// TODO Auto-generated method stub
		if (! this . Pertenece(x)) {
			a[ cant ] = x;
			cant ++;
			}

		
	}

	@Override
	public int Elegir() {
		// TODO Auto-generated method stub
		return a[ cant - 1];
	}

	@Override
	public void Sacar(int x) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i<cant && a[i]!=x)
		i ++;
		if (i < cant ){
		a[i] = a[cant-1];
		cant --;
		}
		
	}

	@Override
	public boolean Pertenece(int x) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < cant && a[i ]!= x)
		i ++;
		return ( i < cant );

	}
	
	
	
}
