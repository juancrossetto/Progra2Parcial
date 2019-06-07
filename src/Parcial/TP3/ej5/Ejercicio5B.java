package Parcial.TP3.ej5;

import API.DiccionarioMultipleTDA;
import implementaciones_dinamicas.DicMultipleL;
import tools.UtilidadesDiccionario;

public class Ejercicio5B {

	//Las claves presentes en D1 y D2, con todos los elementos comunes a las claves
	//coincidentes en ambos
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
		
		
		DiccionarioMultipleTDA diccionario = 
					UtilidadesDiccionario._5_1b_ValoresComunesClavesIguales(D1, D2);
		
		UtilidadesDiccionario.MostrarDiccionario(diccionario);
	}

}
