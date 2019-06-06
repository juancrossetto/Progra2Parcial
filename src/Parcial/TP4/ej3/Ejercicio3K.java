package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.ABB;
import tools.UtilidadesArbolBinario;

public class Ejercicio3K {

	//Contar la cantidad de elementos que están en un cierto nivel N
	public static void main(String[] args) {
		ABBTDA a = new ABB();
        a.InicializarArbol();

        a.AgregarElem(100);
        a.AgregarElem(75);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);
        a.AgregarElem(110);
        a.AgregarElem(111);
        /*La altura siempre se mide de todo el arbol */
        int nivel = 2;
        int elementosEnNivel = UtilidadesArbolBinario.ElementosEnNivel(a, nivel);

        System.out.println("En el nivel (" + nivel + ") hay " + elementosEnNivel + " elementos.");

	}

}
