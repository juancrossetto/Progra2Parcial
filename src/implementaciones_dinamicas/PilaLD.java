package implementaciones_dinamicas;

import API.PilaTDA;

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
		primero = null;
		
	}

	@Override
	public void Apilar(int x) {
		Nodo aux = new Nodo ();
		aux.info = x;
		aux.sig = primero;
		primero = aux ;

		
	}

	@Override
	public void Desapilar() {
		primero = primero.sig;
		
	}

	@Override
	public boolean PilaVacia() {
		return(primero == null);
	}

	@Override
	public int Tope() {
		return primero.info ;
	}

}
