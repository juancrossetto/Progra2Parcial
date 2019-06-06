package Parcial.TP1.ej6;

import API.ColaPrioridadTDA;
import implementaciones_dinamicas.*;

public class Ejercicio6b {
	
    //Determinar si dos colas con prioridad son identicas, misma cantidad de elementos,prioridad, valor de elementos
    public static void main(String[] args){

        ColaPrioridadTDA cp1 = new ColaPrioridadLD();
        ColaPrioridadTDA cp2 = new ColaPrioridadLD();

        cp1.InicializarCola();
        cp1.AcolarPrioridad(3,1);
        cp1.AcolarPrioridad(5,7);
        cp1.AcolarPrioridad(10,2);

        cp2.InicializarCola();
        cp2.AcolarPrioridad(10,1);
        cp2.AcolarPrioridad(15,10);
        cp2.AcolarPrioridad(10,2);


        while(!cp1.ColaVacia() && !cp2.ColaVacia()) {
            if(cp1.Prioridad()==cp2.Prioridad() && cp1.Primero()==cp2.Primero()){
                cp1.Desacolar();
                cp2.Desacolar();
            }else{
                break;
            }
        }

        if(cp1.ColaVacia() && cp2.ColaVacia()){
            System.out.println("Son dos colas con prioridad iguales");
        }else{
            System.out.println("Las colas con proridad no son iguales");
        }
    }
}
