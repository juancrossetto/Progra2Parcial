package implementaciones_estaticas;


import interfaces.ConjuntoTDA;
import interfaces.DiccionarioSimpleTDA;

/*A continuaci´on vamos a llevar a cabo la implementaci´on de los TDA de diccionarios, a partir de la utilizaci´on de arreglos. En el caso del diccionarioSimple
se emplea un ´unico arreglo de elementos que se definen por una clave y un valor.
mientras que en el diccionarioMultiple vamos a emplear un arreglo de elementos donde cada uno de estos contiene una clave y un arreglo de valores. Dado
que las claves y valores de un diccionario no tienen que mantener un criterio
de ordenaniento particular, cuando se elimina una elemento se puede colocar (al
igual que en la implentaci´on del conjunto) el ´ultimo elemento que se encuentra
en el arreglo en la posici´on del elemento a eliminar, y de esta manera evitar el
desplazamiento de todos los elementos.*/

public class DicSimpleA implements DiccionarioSimpleTDA  {
	
	class Elemento{
		int clave;
		int valor;
		}
		Elemento[] elementos;
		int cant ;

	@Override
	public void InicializarDiccionario() {
		// TODO Auto-generated method stub
		cant = 0;
		elementos = new Elemento [100];

		
	}
	
	private int Clave2Indice( int clave){
		int i= cant -1;
		while(i >=0 && elementos[i ]. clave!= clave)
		i --;
		return i;
		}


	@Override
	public void Agregar(int clave, int valor) {
		// TODO Auto-generated method stub
		int pos = Clave2Indice( clave);
		if ( pos == -1) {
		pos = cant ;
		elementos[ pos ]= new Elemento ();
		elementos[ pos ]. clave = clave;
		cant ++;
		}
		elementos[ pos ]. valor = valor;
		
	}

	@Override
	public void Eliminar(int clave) {
		// TODO Auto-generated method stub
		int pos = Clave2Indice( clave);
		if ( pos != -1) {
		elementos[ pos ] = elementos[ cant -1];
		cant --;
		}

		
	}

	@Override
	public int Recuperar(int clave) {
		// TODO Auto-generated method stub
		int pos = Clave2Indice( clave);
		return elementos[ pos ]. valor;
	}

	@Override
	public ConjuntoTDA Claves() {
		// TODO Auto-generated method stub
		ConjuntoTDA  c = new ConjuntoTA();
		c.InicializarConjunto ();
		for ( int i =0; i < cant ; i ++) {
		c.Agregar( elementos[i]. clave);
		}
		return c;

	}

}
