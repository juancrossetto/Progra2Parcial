package tools;

import API.*;
import implementaciones_dinamicas.*;

public class UtilidadesDiccionario {

	public static DiccionarioMultipleTDA _5_1a_JuntoDicd(DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2){
		//Devuelve un dic multiple con las claves presentes en D1 y D2, con todos los elementos asociados a cada clave.
		DiccionarioMultipleTDA res = new DicMultipleLD();
		res.InicializarDiccionario();
		ConjuntoTDA c1 = new ConjuntoLD();
		c1.InicializarConjunto();
		ConjuntoTDA c2 = new ConjuntoLD();
		c2.InicializarConjunto();
		c1 = D1.Claves();
		c2 = D2.Claves();
		while (!c1.ConjuntoVacio()){
			int clave = c1.Elegir();
			ConjuntoTDA valores = D1.Recuperar(clave);
			while (!valores.ConjuntoVacio()){
				int valor = valores.Elegir();
				res.Agregar(clave, valor);
				valores.Sacar(valor);
			}
			c1.Sacar(clave);
		}
		while (!c2.ConjuntoVacio()){
			int clave = c2.Elegir();
			ConjuntoTDA valores = D2.Recuperar(clave);
			while (!valores.ConjuntoVacio()){
				int valor = valores.Elegir();
				res.Agregar(clave, valor);
				valores.Sacar(valor);
			}
			c2.Sacar(clave);
		}
		return res;
	}
	
	public static DiccionarioMultipleTDA DSDM(DiccionarioMultipleTDA d1, DiccionarioMultipleTDA d2){
		DiccionarioMultipleTDA dm= new DicMultipleLD();
		dm.InicializarDiccionario();
		//Metodos m = new Metodos();
		//Tengo que tomar las claves de uno y del otro y luego unirlas
		ConjuntoTDA claves = UtilidadesConjunto.Union(d1.Claves(), d2.Claves());
		while(!claves.ConjuntoVacio()){
			int clave = claves.Elegir();
			ConjuntoTDA valores = UtilidadesConjunto.Union(d1.Recuperar(clave), d2.Recuperar(clave));
			while(!valores.ConjuntoVacio()){
				int valor = valores.Elegir();
				dm.Agregar(clave,valor);
				valores.Sacar(valor);
			}
				claves.Sacar(clave);
		}
		return dm;
	}
	
	//Metodos Diccionario Multiple
	public static void MostrarDiccionario(DiccionarioMultipleTDA Dic){
		
		ConjuntoTDA keys = new ConjuntoLD();
		keys.InicializarConjunto();
		
		keys = Dic.Claves();
		
		while (!keys.ConjuntoVacio()){
			
			System.out.println("Clave:");
			System.out.println(keys.Elegir());
			System.out.println("Elementos:");
			UtilidadesConjunto.MostrarConjunto(Dic.Recuperar(keys.Elegir()));
			keys.Sacar(keys.Elegir());
			
		}
		
	}
}
