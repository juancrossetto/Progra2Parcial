package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.ABB;
import tools.UtilidadesArbolBinario;

public class Ejercicio3H {

	//Calcular la altura de un ABB
	public static void main(String[] args) {
		
		 ABBTDA a = new ABB();
        a.InicializarArbol();

        a.AgregarElem(100);
        a.AgregarElem(75);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);
        
        /*La altura siempre se mide de todo el arbol */
        int altura = UtilidadesArbolBinario.CalcularAltura(a);

        System.out.println("Altura del ABB: " + altura);

	}
	


}
