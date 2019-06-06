package Parcial.TP3.ej3;

import API.ConjuntoTDA;
import implementaciones_estaticas.ConjuntoTA;
import tools.UtilidadesConjunto;

public class Ejercicio3C {

	//Utilizando las operaciones unión, intersección y diferencia
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
        
        
        ConjuntoTDA diferenciaSimetrica = UtilidadesConjunto.DiferenciaSimetricaConOpe(a, b);
        System.out.println("Diferencia Simetrica Con operaciones (unión, intersección y diferencia)");
        UtilidadesConjunto.ImprimirConjunto(diferenciaSimetrica);

	}

}
