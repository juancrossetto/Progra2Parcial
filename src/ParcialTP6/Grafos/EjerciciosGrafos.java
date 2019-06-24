package ParcialTP6.Grafos;

import API.*;
import implementaciones_dinamicas.*;
import tools.UtilidadesArbolBinario;
import tools.UtilidadesConjunto;

public class EjerciciosGrafos {

	// Test
	public static void main(String[] args) {
		GrafoTDA g = new GrafoLA();
		g.InicializarGrafo();
		g.AgregarVertice(1);
		g.AgregarVertice(10);
		g.AgregarVertice(3);
		g.AgregarVertice(2);
		g.AgregarArista(1, 2, 12);
		g.AgregarArista(1, 3, 13);
		EjerciciosGrafos test = new EjerciciosGrafos();
		
		// -----Ejercicio 4-----//
		System.out.println("Ejercicio 4");
		int verticeEj4 = 10;
		ConjuntoTDA verticesAdyacentes = test.VerticesAdyacentesDobles(g, verticeEj4);
		System.out.print("Vertices Adyacentes Dobles de " + verticeEj4 + ": ");
		if(verticesAdyacentes.ConjuntoVacio())
			System.out.println("El vertice indicado no posee adyacentes doble");
		else
			UtilidadesConjunto.ImprimirConjunto(verticesAdyacentes);
		// -----FIN Ejercicio 4-----//
		
		// -----Ejercicio 5-----//
		System.out.println("Ejercicio 5");
		int verticeEj5 = 1;
		int mayorCostoAristasSalientes = test.MayorCostosAristasSalientes(g, verticeEj5);
		System.out.println("El mayor costo del vertice " + verticeEj5 + " es: " + mayorCostoAristasSalientes);
		// -----Ejercicio 5-----//
		

		
		// -----Ejercicio 6-----//
		System.out.println("Ejercicio 6");
		int verticeEj6 = 2;
		ConjuntoTDA predecesoresVertice = test.PredecesoresVertice(g, verticeEj6);
		System.out.print("Vertices Predecesores de " + verticeEj6 + ": ");
		
		if(predecesoresVertice.ConjuntoVacio())
			System.out.println("El vertice no posee predecesores");
		else
			UtilidadesConjunto.ImprimirConjunto(predecesoresVertice);
		// -----Ejercicio 6-----//
		
		// -----Ejercicio 7-----//
		System.out.println("Ejercicio 7");
		ConjuntoTDA verticesAislados = test.VerticesAislados(g);
		System.out.print("Vertices Aislados: ");
		if(verticesAislados.ConjuntoVacio())
			System.out.println("El Grafo no posee Nodos Aislados");
		else
			UtilidadesConjunto.ImprimirConjunto(verticesAislados);
		// -----Ejercicio 7-----//
		
		// -----Ejercicio 8-----//
		System.out.println("Ejercicio 8");
		int vertice1Ej8 = 2;
		int vertice2Ej8 = 1;
		ConjuntoTDA puenteVertices = test.PuenteVertices(g, vertice1Ej8, vertice2Ej8);
		System.out.println("Puente entre vertices " + vertice1Ej8 + " y " + vertice2Ej8 + ":");
		UtilidadesConjunto.ImprimirConjunto(puenteVertices);
		// -----Ejercicio 8-----//
		
		// -----Ejercicio 9-----//
		System.out.println("Ejercicio 9");
		int verticeEj9 = 2;
		int gradoVertice = test.GradoVertice(g, verticeEj9);
		System.out.print("El grado del vertice " + verticeEj5 + " es: " + gradoVertice);
		// -----Ejercicio 9-----//
	}
	
	//Ej (4)
	public ConjuntoTDA VerticesAdyacentesDobles(GrafoTDA g, int v) {
		// Grafo tiene que estar inicializado, con valores y v tiene que existir en el
		// grafo.
		// Devuelve el conjunto de vertices que son adyacentes dobles, Se define que un
		// vertice w es adyacente doble de un vertice v,
		// si existe otro vertice x y hay una arista que comienza en v y termina en x y
		// otra que comienza en x y termina en w
		ConjuntoTDA res = new ConjuntoLD();
		res.InicializarConjunto();
		ConjuntoTDA dum1 = new ConjuntoLD();
		dum1.InicializarConjunto();
		ConjuntoTDA dum2 = new ConjuntoLD();
		dum2.InicializarConjunto();
		dum1 = g.Vertices();
		while (!dum1.ConjuntoVacio()) {
			if (g.ExisteArista(v, dum1.Elegir()))
				dum2.Agregar(dum1.Elegir());
			dum1.Sacar(dum1.Elegir());
		}
		while (!dum2.ConjuntoVacio()) {
			dum1 = g.Vertices();
			while (!dum1.ConjuntoVacio()) {
				if (g.ExisteArista(dum2.Elegir(), dum1.Elegir()))
					res.Agregar(dum1.Elegir());
				dum1.Sacar(dum1.Elegir());
			}
			dum2.Sacar(dum2.Elegir());
		}
		return res;
	}

	//Ej (5)
	public int MayorCostosAristasSalientes(GrafoTDA g, int v) {
		// Grafo tiene que estar inicializado, con valores y v tiene que existir en el
		// grafo.
		// Devuelve el valor mayor de las aristas que salen de v.
		ConjuntoTDA res = new ConjuntoLD();
		res.InicializarConjunto();
		res = g.Vertices();
		int x = 0;
		while (!res.ConjuntoVacio()) {
			if (g.ExisteArista(v, res.Elegir()))
				if (g.PesoArista(v, res.Elegir()) > x)
					x = g.PesoArista(v, res.Elegir());
			res.Sacar(res.Elegir());
		}
		return x;
	}

	//Ej (6)
	public ConjuntoTDA PredecesoresVertice(GrafoTDA g, int v) {
		// Grafo tiene que estar inicializado, con valores y v tiene que existir en el
		// grafo.
		// Devuelve el conjunto de vertices que tienen una arista que termina en v.
		ConjuntoTDA res = new ConjuntoLD();
		res.InicializarConjunto();
		ConjuntoTDA dum1 = new ConjuntoLD();
		dum1.InicializarConjunto();
		dum1 = g.Vertices();
		while (!dum1.ConjuntoVacio()) {
			if (g.ExisteArista(dum1.Elegir(), v))
				res.Agregar(dum1.Elegir());
			dum1.Sacar(dum1.Elegir());
		}
		return res;
	}

	//Ej (7)
	public ConjuntoTDA VerticesAislados(GrafoTDA g) {
		// Grafo tiene que estar inicializado, con valores.
		// Devuelve el conjunto de vertices que no tengan aristas entrantes ni
		// salientes.
		ConjuntoTDA res = new ConjuntoLD();
		res.InicializarConjunto();
		ConjuntoTDA dum = new ConjuntoLD();
		dum.InicializarConjunto();
		ConjuntoTDA dum2 = new ConjuntoLD();
		dum.InicializarConjunto();
		int x;
		boolean y = true;
		while (!dum.ConjuntoVacio()) {
			x = dum.Elegir();
			dum2 = g.Vertices();
			while (!dum2.ConjuntoVacio() && y) {
				if (g.ExisteArista(x, dum2.Elegir()))
					y = false;
				dum2.Sacar(dum2.Elegir());
			}
			dum2 = g.Vertices();
			while (!dum2.ConjuntoVacio() && y) {
				if (g.ExisteArista(dum2.Elegir(), x))
					y = false;
				dum2.Sacar(dum2.Elegir());
			}
			if (y)
				res.Agregar(x);
			y = true;
			dum.Sacar(x);
		}
		return res;
	}

	//Ej (8)
	public ConjuntoTDA PuenteVertices(GrafoTDA g, int v1, int v2) {
		// Grafo tiene que estar inicializado, con valores y v1, v2 tiene que existir en
		// el grafo.
		// Devuelve el conjunto de vertices que tiene un arista en empieza en v1 y
		// termina en este, y que empiezen en el mismo
		// y terminen en v2.
		ConjuntoTDA res = new ConjuntoLD();
		res.InicializarConjunto();
		ConjuntoTDA dum = new ConjuntoLD();
		dum.InicializarConjunto();
		ConjuntoTDA dum2 = new ConjuntoLD();
		dum2.InicializarConjunto();
		dum = g.Vertices();
		while (!dum.ConjuntoVacio()) {
			if (g.ExisteArista(v1, dum.Elegir()))
				dum2.Agregar(dum.Elegir());
			dum.Sacar(dum.Elegir());
		}
		while (!dum2.ConjuntoVacio()) {
			if (g.ExisteArista(dum.Elegir(), v2))
				res.Agregar(dum.Elegir());
			dum2.Sacar(dum2.Elegir());
		}
		return res;
	}

	//Ej (9)
	public int GradoVertice(GrafoTDA g, int v) {
		// Grafo tiene que estar inicializado, con valores y v tiene que existir en el
		// grafo.
		// Devuelve el valor que es la resta entre la cantidad de vertices salientes y
		// entrantes.
		ConjuntoTDA res = new ConjuntoLD();
		res.InicializarConjunto();
		res = g.Vertices();
		int x = 0;
		while (!res.ConjuntoVacio()) {
			if (g.ExisteArista(v, res.Elegir()))
				x++;
			res.Sacar(res.Elegir());
		}
		res = g.Vertices();
		while (!res.ConjuntoVacio()) {
			if (g.ExisteArista(res.Elegir(), v))
				x--;
			res.Sacar(res.Elegir());
		}
		return x;
	}
}
