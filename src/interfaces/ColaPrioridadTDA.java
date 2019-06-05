package interfaces;

/*
Cada elemento cuando ingresa a la misma se le va a asignar una prioridad, y luego los elementos van a ser recuperados o eliminados
de la estructura de acuerdo a esa prioridad
A numero mas alto -> mayor prioridad
 */

public interface ColaPrioridadTDA {
	void InicializarCola();
	void AcolarPrioridad(int x, int prioridad);
	void Desacolar();
	int Primero();
	boolean ColaVacia();
	int Prioridad();

}
