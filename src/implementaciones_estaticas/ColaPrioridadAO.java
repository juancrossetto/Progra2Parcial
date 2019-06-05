package implementaciones_estaticas;

import API.ColaPrioridadTDA;

/*
 * Otra opci´on de implementaci´on de las colas de prioridades es
considerar un arreglo cuyos elementos representan una estructura (por ser en
Java una clase) que contiene el valor y la prioridad asociada a ese valor
 * 
 * 
 * */

public class ColaPrioridadAO implements ColaPrioridadTDA  {
	
	class Elemento{
		int valor;
		int prioridad;
		}
	
	Elemento[] elementos;
	int indice;


	@Override
	public void InicializarCola() {
		// TODO Auto-generated method stub
		indice = 0;
		elementos = new Elemento [100];

		
	}

	@Override
	public void AcolarPrioridad(int x, int prioridad) {
		// TODO Auto-generated method stub
		int j = indice;
		// desplaza a derecha los elementos de la cola mientras
		// estos tengan mayor o igual prioridad que la de x
		for (; j >0 && elementos[j -1]. prioridad >= prioridad; j --){
		elementos[j] = elementos[j -1];
		}
		elementos[ j]= new Elemento();
		elementos[ j]. valor=x;
		elementos[ j]. prioridad = prioridad;
		indice++;
		
	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub
		elementos[ indice - 1]= null ;
		indice --;

		
	}

	@Override
	public int Primero() {
		// TODO Auto-generated method stub
		return elementos[ indice -1]. valor;

	}

	@Override
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return ( indice == 0);
	}

	@Override
	public int Prioridad() {
		// TODO Auto-generated method stub
		return elementos[ indice -1]. prioridad;
	}

}
