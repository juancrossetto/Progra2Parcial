package tools;

import java.util.Arrays;

import API.ColaPrioridadTDA;
import implementaciones_dinamicas.ColaPrioridadLD;
import implementaciones_estaticas.ColaPrioridadAO;

public class UtilidadesColaPrioridad {

	
	public static void ImprimirColaPrioridad(ColaPrioridadTDA cp) {
        ColaPrioridadTDA aux=new ColaPrioridadLD();
        aux.InicializarCola();
        CopiarColaPrioridad(cp,aux);
        int cont = 0;
        while(!aux.ColaVacia()){
        	cont++;
            System.out.println("Elemento: " + cont + " ,Valor: " + aux.Primero() + ",Prioridad: " + aux.Prioridad());
            aux.Desacolar();
        }
    }
	
	public static void PasarColaPrioridad(ColaPrioridadTDA origen, ColaPrioridadTDA destino){
        while(!origen.ColaVacia()){
            destino.AcolarPrioridad(origen.Primero(), origen.Prioridad());
            origen.Desacolar();
        }
    }
    
    public static void CopiarColaPrioridad(ColaPrioridadTDA o, ColaPrioridadTDA d){

        ColaPrioridadTDA aux=new ColaPrioridadLD();
        aux.InicializarCola();

        PasarColaPrioridad(o,aux);

        while(!aux.ColaVacia()){
            d.AcolarPrioridad(aux.Primero(),aux.Prioridad());
            o.AcolarPrioridad(aux.Primero(), aux.Prioridad());
            aux.Desacolar();
        }
    }
    
	public static void ImprimirColaPrioridadConTexto(String text ,  ColaPrioridadTDA cola){
		ColaPrioridadTDA aux = new ColaPrioridadAO();
		aux.InicializarCola();
		aux = CopiarColaPrioridad(cola);
		int[] out = new int[10];
		int n = 0;
		while(!aux.ColaVacia()){
			out[n] = aux.Primero();
			aux.Desacolar();
			n++;
		}
		System.out.println(text + Arrays.toString(out));
	}
	
	public static ColaPrioridadTDA CopiarColaPrioridad(ColaPrioridadTDA cola){
		ColaPrioridadTDA caux = new ColaPrioridadAO();
		ColaPrioridadTDA caux2 = new ColaPrioridadAO();
		caux.InicializarCola();
		caux2.InicializarCola();

		while(!cola.ColaVacia()){
			caux.AcolarPrioridad(cola.Primero(), cola.Prioridad());
			caux2.AcolarPrioridad(cola.Primero(), cola.Prioridad() );
			cola.Desacolar();
		}

		cola.InicializarCola();

		while(!caux.ColaVacia()){
			cola.AcolarPrioridad(caux.Primero(), caux.Prioridad());//dejo el origen como estaba.
			caux.Desacolar();

		}
		return caux2;
	}
}
