package tools;

import API.*;
import implementaciones_estaticas.ColaPU;
import implementaciones_estaticas.PilaTF;

public class UtilidadesPila {


    public static void PasarCola(ColaTDA origen, ColaTDA destino){
        while(!origen.ColaVacia()){
            destino.Acolar(origen.Primero());
            origen.Desacolar();
        }
    }

    public static void PasarPila(PilaTDA origen, PilaTDA destino){
        while(!origen.PilaVacia()){
            destino.Apilar(origen.Tope());
            origen.Desapilar();
        }
    }

    public static void CopiarPila(PilaTDA o, PilaTDA d){

        PilaTDA aux=new PilaTF();
        aux.InicializarPila();

        PasarPila(o,aux);

        while(!aux.PilaVacia()){
            d.Apilar(aux.Tope());
            o.Apilar(aux.Tope());
            aux.Desapilar();
        }
    }

    public static void ImprimirPila(PilaTDA a) {
        PilaTDA aux=new PilaTF();
        aux.InicializarPila();
        CopiarPila(a,aux);
        while(!aux.PilaVacia()){
            System.out.println(aux.Tope());
            aux.Desapilar();
        }
    }
    
    public static void Pila(PilaTDA pila) {
		ColaTDA colaAux = new ColaPU();
		colaAux.InicializarCola();

		while (!pila.PilaVacia()) {
			colaAux.Acolar(pila.Tope());
			pila.Desapilar();
		}

		while (!colaAux.ColaVacia()) {
			pila.Apilar(colaAux.Primero());
			colaAux.Desacolar();
		}
	}
    
	public static int ContarElementosPila(PilaTDA pila) {

		PilaTDA aux = new PilaTF();
		aux.InicializarPila();

		UtilidadesPila.CopiarPila(pila, aux);

		int i = 0;
		while (!aux.PilaVacia()) {
			aux.Desapilar();
			i++;
		}
		return i;
	}
	
	public static int SumarElementosPila(PilaTDA pila) {

		PilaTDA aux = new PilaTF();
		aux.InicializarPila();

		UtilidadesPila.CopiarPila(pila, aux);

		int i = 0;

		while (!aux.PilaVacia()) {
			i = aux.Tope() + i;
			aux.Desapilar();
		}
		return i;
	}

	public static int CalularPromedioElementosPila(PilaTDA pila) {

		PilaTDA aux = new PilaTF();
		aux.InicializarPila();

		UtilidadesPila.CopiarPila(pila, aux);

		int cantidad = 0;
		int suma = 0;
		while (!aux.PilaVacia()) {
			suma = aux.Tope() + suma;
			aux.Desapilar();
			cantidad++;
		}
		return suma / cantidad;

	}
	
	public static void InvertirElementosPila(PilaTDA pila) {
        ColaTDA colaAux=new ColaPU();
        colaAux.InicializarCola();


        while(!pila.PilaVacia()){
            colaAux.Acolar(pila.Tope());
            pila.Desapilar();
        }

        while(!colaAux.ColaVacia()){
            pila.Apilar(colaAux.Primero());
            colaAux.Desacolar();
        }
    }
	
}
