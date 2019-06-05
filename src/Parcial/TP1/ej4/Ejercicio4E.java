package Parcial.TP1.ej4;

import API.ColaTDA;
import API.PilaTDA;
import implementaciones_estaticas.*;
import tools.UtilidadesCola;
import tools.UtilidadesPila;

public class Ejercicio4E {

	/*Determinar si una Cola es capicua o no. Para ser capicua debe cumplir
	que el primer elemento es igual al último, el segundo igual al penúltimo, etc*/
	public static void main(String[] args) {
		
		ColaTDA cola = new ColaPI();
		cola.InicializarCola();
		cola.Acolar(1);
		cola.Acolar(2);
		cola.Acolar(3);
		cola.Acolar(2);
		cola.Acolar(1);

		System.out.println("La cola:");
		UtilidadesCola.ImprimirCola(cola);
		
		boolean colaEsCapicua = UtilidadesCola.esColaCapicua(cola);
		if(colaEsCapicua) {
			System.out.println("es Capicua: ");
		}	else {
			System.out.println("NO es Capicua: ");
		}
		
		
	}

}