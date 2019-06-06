package Parcial.TP4.ej3;

import API.ABBTDA;
import implementaciones_dinamicas.ABB;
import tools.UtilidadesArbolBinario;

public class Ejercicio3I {

	//Comprobar si dos ABBs tienen la misma forma
	public static void main(String[] args) {
		ABBTDA a = new ABB();
        a.InicializarArbol();

        a.AgregarElem(100);
        a.AgregarElem(75);
        a.AgregarElem(50);
        a.AgregarElem(30);
        a.AgregarElem(10);
        a.AgregarElem(15);
        
        ABBTDA b = new ABB();
        b.InicializarArbol();

        b.AgregarElem(100);
        b.AgregarElem(75);
        b.AgregarElem(50);
        b.AgregarElem(29);
        b.AgregarElem(10);
        b.AgregarElem(15);
        
        
        /*La altura siempre se mide de todo el arbol */
        boolean arbolesMismaForma = UtilidadesArbolBinario.ABBMismaForma(a, b);

        if(arbolesMismaForma)
            System.out.println("Los arboles tienen la misma forma");
        else
        	System.out.println("Los arboles NO tienen la misma forma");
        	
	        

	}
	
	

}
