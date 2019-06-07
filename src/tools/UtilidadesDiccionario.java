package tools;

import API.*;
import implementaciones_dinamicas.*;

public class UtilidadesDiccionario {

	//TP3 5.A
	public static DiccionarioMultipleTDA _5_1a_JuntoDic(DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2){
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
	
	//TP3 5.A Version 2
	public static DiccionarioMultipleTDA JuntarDiccionarios2(DiccionarioMultipleTDA d1, DiccionarioMultipleTDA d2){
		DiccionarioMultipleTDA dm= new DicMultipleLD();
		dm.InicializarDiccionario();
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
	
	//TP 5.B
	public static DiccionarioMultipleTDA _5_1b_ValoresComunesClavesIguales (DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2){
		//Devuelve un dic multiple con las claves presentes en D1 y D2, con todos los elementos comunes a las claves
		//coincidentes en ambos.
		DiccionarioMultipleTDA res = _5_1a_JuntoDic(D1, D2);
		ConjuntoTDA c1 = new ConjuntoLD(); c1.InicializarConjunto();
		ConjuntoTDA c2 = new ConjuntoLD(); c2.InicializarConjunto();
		ConjuntoTDA c3 = new ConjuntoLD(); 	
		c1 = D1.Claves(); c2 = D2.Claves();
		c3 = UtilidadesConjunto.Interseccion(c1, c2);		
		while (!c3.ConjuntoVacio()){
			int clave = c3.Elegir();			
			ConjuntoTDA valores = UtilidadesConjunto.Diferencia(D1.Recuperar(clave), D2.Recuperar(clave));			
			while (!valores.ConjuntoVacio()){
				int valor = valores.Elegir();
				res.EliminarValor(clave, valor);
				valores.Sacar(valor);
			}
			c3.Sacar(clave);
			
		}		
		c3 = UtilidadesConjunto.Diferencia(c1, c2);
		while (!c3.ConjuntoVacio()){
			int clave = c3.Elegir();			
			ConjuntoTDA valores = D1.Recuperar(clave);
			while (!valores.ConjuntoVacio()){
				int valor = valores.Elegir();
				res.EliminarValor(clave, valor);
				valores.Sacar(valor);
			}
			valores = D2.Recuperar(clave);
			while (!valores.ConjuntoVacio()){
				int valor = valores.Elegir();
				res.EliminarValor(clave, valor);
				valores.Sacar(valor);
			}
			c3.Sacar(clave);			
		}		
		return res;		
	}
	
	//TP5 5.D Version 2 (Alternativa)
	public static DiccionarioMultipleTDA DicConElementosComunes(DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2){
		
		DiccionarioMultipleTDA DicConElementosEnComun = new DicMultipleL();
		
		ConjuntoTDA ClavesUnion = new ConjuntoLD();
		ClavesUnion.InicializarConjunto();
		ClavesUnion = UtilidadesConjunto.Union(D1.Claves(),D2.Claves());
		
		ConjuntoTDA ElemInterseccion = new ConjuntoLD();
		ElemInterseccion.InicializarConjunto();
		
		ColaTDA Cola = new ColaLD();
		Cola.InicializarCola();
		
		while (!ClavesUnion.ConjuntoVacio()) {
			
			ElemInterseccion = UtilidadesConjunto.Interseccion(D1.Recuperar(ClavesUnion.Elegir()),D2.Recuperar(ClavesUnion.Elegir()));
			Cola = UtilidadesCola.PasarConjuntoACola(ElemInterseccion);
			while (!Cola.ColaVacia()) {
				DicConElementosEnComun.Agregar(ClavesUnion.Elegir(), Cola.Primero());
				Cola.Desacolar();
			}
			ClavesUnion.Sacar(ClavesUnion.Elegir());
		}
		return DicConElementosEnComun;
	}

	//TP3 5.C
	public static DiccionarioMultipleTDA _5_1c_ValoresClavesComunes (DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2){
		//Devuelve un dic multiple con las claves comunes de D1 y D2, con todos los elementos asociados a cada clave.
		DiccionarioMultipleTDA res = new DicMultipleLD();
		res.InicializarDiccionario();
		ConjuntoTDA clavesComunes = UtilidadesConjunto.Interseccion(D1.Claves(), D2.Claves());
		while (!clavesComunes.ConjuntoVacio()){
			int clave = clavesComunes.Elegir();
			clavesComunes.Sacar(clave);
			ConjuntoTDA valores = new ConjuntoLD(); valores.InicializarConjunto();
			valores = D1.Recuperar(clave);
			while (!valores.ConjuntoVacio()){
				int valor = valores.Elegir();
				valores.Sacar(valor);
				res.Agregar(clave, valor);
			}
			valores = D2.Recuperar(clave);
			while (!valores.ConjuntoVacio()){
				int valor = valores.Elegir();
				valores.Sacar(valor);
				res.Agregar(clave, valor);
			}
		}
		return res;
	}
	
	//TP3 5.D
	public static DiccionarioMultipleTDA _5_1d_ValoresComunesClavesComunes (DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2){
		//Devuelve un dic multiple con las claves comunes de D1 y D2, con todos los elementos comunes a las claves
		//coincidentes en ambos.
		DiccionarioMultipleTDA res = new DicMultipleLD();
		res.InicializarDiccionario();
		ConjuntoTDA clavesComunes = UtilidadesConjunto.Interseccion(D1.Claves(), D2.Claves());
		while (!clavesComunes.ConjuntoVacio()){
			int clave = clavesComunes.Elegir();
			clavesComunes.Sacar(clave);
			ConjuntoTDA valoresComunes = UtilidadesConjunto.Interseccion(D1.Recuperar(clave), D2.Recuperar(clave));
			while (!valoresComunes.ConjuntoVacio()){
				int valor = valoresComunes.Elegir();
				valoresComunes.Sacar(valor);
				res.Agregar(clave, valor);
			}
		}
		return res;
	}	
	
	//TP5 5.C Version 2 (Alternativa)
	public static DiccionarioMultipleTDA DicConClavesComunes(DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2){
		DiccionarioMultipleTDA DicConElementosEnComun = new DicMultipleL();
		ConjuntoTDA ClavesInterseccion = new ConjuntoLD();
		ClavesInterseccion.InicializarConjunto();
		ClavesInterseccion = UtilidadesConjunto.Interseccion(D1.Claves(),D2.Claves());
		ConjuntoTDA ElemUnion = new ConjuntoLD();
		ElemUnion.InicializarConjunto();
		ColaTDA Cola = new ColaLD();
		Cola.InicializarCola();
		while (!ClavesInterseccion.ConjuntoVacio()) {
			ElemUnion = UtilidadesConjunto.Union(D1.Recuperar(ClavesInterseccion.Elegir()),D2.Recuperar(ClavesInterseccion.Elegir()));
			Cola = UtilidadesCola.PasarConjuntoACola(ElemUnion);
			while (!Cola.ColaVacia()) {
				DicConElementosEnComun.Agregar(ClavesInterseccion.Elegir(), Cola.Primero());
				Cola.Desacolar();
			}
			ClavesInterseccion.Sacar(ClavesInterseccion.Elegir());
		}
		return DicConElementosEnComun;
	}
	
	//TP3 5.2
	public static DiccionarioMultipleTDA _5_2(DiccionarioSimpleTDA D) {
		// Genera un dic multiple con claves que son los valores de D y valores como las claves que tenian asociado ese valor de D		
		DiccionarioMultipleTDA res = new DicMultipleLD(); 
		res.InicializarDiccionario();
		ConjuntoTDA c1 = new ConjuntoLD(); 
		c1.InicializarConjunto();
		c1 = D.Claves();
		while (!c1.ConjuntoVacio()) {
			int valor = c1.Elegir();
			c1.Sacar(valor);
			res.Agregar(D.Recuperar(valor), valor);			
		}		
		return res;
	}
}
