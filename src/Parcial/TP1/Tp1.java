package Parcial.TP1;

import API.*;
import implementaciones_estaticas.*;
import tools.UtilidadesPila;

public class Tp1 {

	public void InvertirElementosPila(PilaTDA pila) {
		ColaTDA colaAux = new ColaPU();
		colaAux.InicializarCola();

		while (!pila.PilaVacia()) {
			colaAux.Acolar(pila.Tope());
			pila.Desapilar();
		}

		while (!colaAux.ColaVacia()) {
			pila.Apilar(colaAux.Primero());
			colaAux.Desacolar();
		}
	}

	public int ContarElementosPila(PilaTDA pila) {

		PilaTDA aux = new PilaTF();
		aux.InicializarPila();

		UtilidadesPila.CopiarPila(pila, aux);

		int i = 0;
		while (!aux.PilaVacia()) {
			aux.Desapilar();
			i++;
		}
		return i;
	}

	public int SumarElementosPila(PilaTDA pila) {

		PilaTDA aux = new PilaTF();
		aux.InicializarPila();

		UtilidadesPila.CopiarPila(pila, aux);

		int i = 0;

		while (!aux.PilaVacia()) {
			i = aux.Tope() + i;
			aux.Desapilar();
		}
		return i;
	}

	public int CalularPromedioElementosPila(PilaTDA pila) {

		PilaTDA aux = new PilaTF();
		aux.InicializarPila();

		UtilidadesPila.CopiarPila(pila, aux);

		int cantidad = 0;
		int suma = 0;
		while (!aux.PilaVacia()) {
			suma = aux.Tope() + suma;
			aux.Desapilar();
			cantidad++;
		}
		return suma / cantidad;

	}
}