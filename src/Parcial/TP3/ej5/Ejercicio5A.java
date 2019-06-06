package Parcial.TP3.ej5;

import API.*;
import implementaciones_dinamicas.*;
import tools.UtilidadesDiccionario;

public class Ejercicio5A {

	/*5) A partir del TDA Diccionario, escribir distintos métodos externos que permitan
	5.1) Dados dos DiccionarioMultipleTDA D1 y D2, generar un DiccionarioMultipleTDA que
	contenga:*/
	//las claves presentes en D1 y D2, con todos los elementos asociados a cada clave
	public static void main(String[] args) {
		
		DiccionarioMultipleTDA D1 = new DicMultipleL();
		D1.InicializarDiccionario();
		D1.Agregar(1, 10);
		D1.Agregar(2, 20);
		
		DiccionarioMultipleTDA D2 = new DicMultipleL();
		D2.InicializarDiccionario();
		D2.Agregar(3, 30);
		D2.Agregar(4, 40);
		
		DiccionarioMultipleTDA elementosConClaveRepetida = 
								UtilidadesDiccionario.DSDM(D1, D2);
		
		UtilidadesDiccionario.MostrarDiccionario(elementosConClaveRepetida);
		
	}

}
