package Parcial.TP3.ej5;

import API.*;
import implementaciones_dinamicas.*;
import tools.UtilidadesDiccionario;

public class Ejercicio5A {

	/*5) A partir del TDA Diccionario, escribir distintos m�todos externos que permitan
	5.1) Dados dos DiccionarioMultipleTDA D1 y D2, generar un DiccionarioMultipleTDA que
	contenga:*/
	//las claves presentes en D1 y D2, con todos los elementos asociados a cada clave
	public static void main(String[] args) {
		
		DiccionarioMultipleTDA D1 = new DicMultipleL();
		D1.InicializarDiccionario();
		
		DiccionarioMultipleTDA D2 = new DicMultipleL();
		D2.InicializarDiccionario();
		
		D1.Agregar(1, 5);
		D1.Agregar(1, 6);
		D1.Agregar(1, 8);
		D1.Agregar(3, 4);
		D1.Agregar(3, 9);
		D1.Agregar(3, 10);
		D1.Agregar(8, 1);
		D1.Agregar(8, 3);
		D1.Agregar(8, 5);
		
		D2.Agregar(4, 10);
		D2.Agregar(4, 8);
		D2.Agregar(4, 4);
		D2.Agregar(1, 5);
		D2.Agregar(1, 9);
		D2.Agregar(1, 10);
		D2.Agregar(3, 9);
		D2.Agregar(3, 10);
		D2.Agregar(3, 5);
		D2.Agregar(8, 8);
		D2.Agregar(8, 9);
		D2.Agregar(8, 6);
		
		DiccionarioMultipleTDA elementosConClaveRepetida = 
								UtilidadesDiccionario._5_1a_JuntoDic(D1, D2);
		
		UtilidadesDiccionario.MostrarDiccionario(elementosConClaveRepetida);
		
	}

}
