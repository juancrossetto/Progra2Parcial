package implementaciones_dinamicas;

import interfaces.PilaTDA;

/*
 * La estrategia entonces ser´a mantener una cadena de nodos, manteniendo un puntero al tope de la pila, este apuntar´a al siguiente, y as sucesivamente. Si la lista
est´a vaca, ser´a un punterno null. Para agregar un nodo, se lo crea, y se agrega al
comienzo de la cadena. Para eliminarlo, simplemente se elimina el primer nodo,
dejando el puntero apuntando al segundo si es que existe
 * */

public class PilaLD implements PilaTDA {
	
	Nodo primero;

	@Override
	public void InicializarPila() {
		// TODO Auto-generated method stub
		primero = null ;
		
	}

	@Override
	public void Apilar(int x) {
		// TODO Auto-generated method stub
		Nodo aux = new Nodo ();
		aux . info = x;
		aux . sig = primero;
		primero = aux ;

		
	}

	@Override
	public void Desapilar() {
		// TODO Auto-generated method stub
		primero = primero.sig ;
		
	}

	@Override
	public boolean PilaVacia() {
		// TODO Auto-generated method stub
		return ( primero == null ) ;
	}

	@Override
	public int Tope() {
		// TODO Auto-generated method stub
		return primero.info ;
	}

}
