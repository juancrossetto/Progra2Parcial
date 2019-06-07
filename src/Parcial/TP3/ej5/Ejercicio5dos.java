package Parcial.TP3.ej5;

import API.DiccionarioMultipleTDA;
import API.DiccionarioSimpleTDA;
import implementaciones_dinamicas.DicSimpleL;
import tools.UtilidadesDiccionario;

public class Ejercicio5dos {

	/*5.2) Dado un Diccionario Simple D, que representa el concepto clásico de diccionario: la
	clave representa una palabra y el valor su significado. Generar un Diccionario Múltiple DS
	que a partir de un significado s, vincule todas las palabras que tienen dicho significado, es
	decir que son sinónimos. Cada clave s será un significado y los valores asociados
	(sinónimos) aquellas claves de D que tenían asociado el valor s*/
	public static void main(String[] args) {
		DiccionarioSimpleTDA D1 = new DicSimpleL();
		D1.InicializarDiccionario();
		D1.Agregar(1, 10);
		D1.Agregar(2, 20);
		D1.Agregar(1, 10);
		D1.Agregar(3, 40);
		
		DiccionarioMultipleTDA result = UtilidadesDiccionario._5_2(D1);
		UtilidadesDiccionario.MostrarDiccionario(result);

	}

}
