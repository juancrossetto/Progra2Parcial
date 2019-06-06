package tools;

import API.*;
import implementaciones_dinamicas.*;
import implementaciones_estaticas.*;

public class UtilidadesCola {


    public static void CopiarInvertiendo(ColaTDA origen, ColaTDA destino){
        PilaTDA pilaAux=new PilaTI();
        pilaAux.InicializarPila();
        ColaTDA aux=new ColaPI();
        aux.InicializarCola();

        CopiarCola(origen,aux);

        while(!aux.ColaVacia()){
            pilaAux.Apilar(aux.Primero());
            aux.Desacolar();
        }

        while(!pilaAux.PilaVacia()){
            destino.Acolar(pilaAux.Tope());
            pilaAux.Desapilar();
        }
    }

    public static void PasarCola(ColaTDA origen, ColaTDA destino){
        while(!origen.ColaVacia()){
            destino.Acolar(origen.Primero());
            origen.Desacolar();
        }
    }

    public static void CopiarCola(ColaTDA o, ColaTDA d){

        ColaTDA aux=new ColaPU();
        aux.InicializarCola();

        PasarCola(o,aux);

        while(!aux.ColaVacia()){
            d.Acolar(aux.Primero());
            o.Acolar(aux.Primero());
            aux.Desacolar();
        }
    }

    
    
    public static int UltimoElemento(ColaTDA origen){
        int e=0;
        while(!origen.ColaVacia()){
            e=origen.Primero();
            origen.Desacolar();
        }
        return e;
    }

    public static void ImprimirCola(ColaTDA a) {
        ColaTDA aux=new ColaPU();
        aux.InicializarCola();
        CopiarCola(a,aux);
        while(!aux.ColaVacia()){
            System.out.println(aux.Primero());
            aux.Desacolar();
        }
    }
    
    
    
    public static boolean esColaCapicua(ColaTDA c){
    	ColaTDA aux1 = new ColaLD();
    	aux1.InicializarCola();
    	int cant = 0;
    	PilaTDA p = new PilaLD();
    	p.InicializarPila();
    	while (!c.ColaVacia()){
	    	aux1.Acolar(c.Primero());
	    	cant ++;
	    	c.Desacolar();
    	}
    	// Devuelve la parte entera de una division
    	int mitad = cant /2;
    	while (!aux1.ColaVacia() && mitad > 0) {
	    	p.Apilar(aux1.Primero());
	    	aux1.Desacolar();
	    	mitad--;
    	}
    	// Retorna 0 si el numero es par y 1 si es impar
    	if(( cant %2) != 0){
    		aux1.Desacolar();
    	}
    	
    	while(!p.PilaVacia() && ! aux1.ColaVacia()) {
	    	if (p.Tope () != aux1.Primero()){
	    		return false;
	    	}	
	    	p.Desapilar();
	    	aux1.Desacolar();
    	}
    	return (p.PilaVacia() && aux1.ColaVacia());
    }

    
}
