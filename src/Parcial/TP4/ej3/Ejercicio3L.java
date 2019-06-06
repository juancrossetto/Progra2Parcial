package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.ABB;
import tools.UtilidadesArbolBinario;

public class Ejercicio3L {

	/*Mostrar por pantalla todos los elementos que contiene un ABB
	i.In-orden
	ii.Pre-orden
	iii.Post-orden*/
	public static void main(String[] args) {
		ABBTDA a = new ABB();
        a.InicializarArbol();

        a.AgregarElem(100);
        a.AgregarElem(75);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        
        System.out.println("i-Impresión In-Orden");
        //muestra el arbol en orden
        UtilidadesArbolBinario.InOrder(a);
        
        System.out.println("ii-Impresión Pre-Orden");
      //muestra el padre y despues los hijos del arbol
        UtilidadesArbolBinario.PreOrder(a);
        
        System.out.println("iii-Impresión Post-Orden");
      //muestra los hijos y despues el padre del arbol
        UtilidadesArbolBinario.PostOrder(a);

	}

}
