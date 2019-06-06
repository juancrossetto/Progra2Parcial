package Parcial.TP3.ej3;

import API.ConjuntoTDA;
import implementaciones_estaticas.ConjuntoTA;
import tools.UtilidadesConjunto;

public class Ejercicio3A {
	
	/*A partir del TDA Conjunto, escribir distintos métodos externos que permitan
	 a) Calcular la diferencia simétrica entre dos conjuntos A y B (definido en clase)*/
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

        b.Agregar(20);
        b.Agregar(10);
        b.Agregar(5);
        b.Agregar(11);
        b.Agregar(33);
        
        
        ConjuntoTDA diferenciaSimetrica = UtilidadesConjunto.DiferenciaSimetrica(a, b);
        System.out.println("Diferencia Simetrica"); //La diferencia de los 2 conjuntos
        UtilidadesConjunto.ImprimirConjunto(diferenciaSimetrica);

	}

}
