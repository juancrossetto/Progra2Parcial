package tools;

import API.ColaPrioridadTDA;
import implementaciones_dinamicas.ColaPrioridadLD;

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
}
