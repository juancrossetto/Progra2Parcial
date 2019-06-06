package Parcial.TP3.ej3;

import API.ConjuntoTDA;
import implementaciones_estaticas.ConjuntoTA;
import tools.UtilidadesConjunto;

public class Ejercicio3D {

	//Determinar si dos conjuntos son iguales
	public static void main(String[] args) {
		ConjuntoTDA a =new ConjuntoTA();
        a.InicializarConjunto();

        a.Agregar(5);
        a.Agregar(10);
        a.Agregar(20);
        a.Agregar(4);
        a.Agregar(9);


        ConjuntoTDA b=new ConjuntoTA();
        b.InicializarConjunto();

        b.Agregar(5);
        b.Agregar(9);
        b.Agregar(10);
        b.Agregar(4);
        b.Agregar(20);
        
        
        boolean conjuntosIguales = UtilidadesConjunto.SonConjuntosIguales(a, b);
        if(conjuntosIguales)
        	System.out.println("Los conjuntos indicados son iguales");
        else
        	System.out.println("Los conjuntos indicados NO son iguales");
        

	}

}
