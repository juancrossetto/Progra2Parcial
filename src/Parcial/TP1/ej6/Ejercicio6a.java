package Parcial.TP1.ej6;

import API.ColaPrioridadTDA;
import implementaciones_dinamicas.*;
import tools.UtilidadesCola;
import tools.UtilidadesColaPrioridad;

public class Ejercicio6a {

    /*Combinar dos colas con prioridades CP1 y CP2, generando una nueva
	cola con prioridades. Considerar que a igual prioridad, los elementos de la CP1*/
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


        ColaPrioridadTDA nueva = new ColaPrioridadLD();
        nueva.InicializarCola();

        while(!cp1.ColaVacia() && !cp2.ColaVacia()) {
            if(cp1.Prioridad()>=cp2.Prioridad()){
                nueva.AcolarPrioridad(cp1.Primero(),cp1.Prioridad());
                nueva.AcolarPrioridad(cp2.Primero(),cp2.Prioridad());
            }else{
                nueva.AcolarPrioridad(cp2.Primero(),cp2.Prioridad());
                nueva.AcolarPrioridad(cp1.Primero(),cp1.Prioridad());
            }
            cp1.Desacolar();
            cp2.Desacolar();
        }

        while(!cp1.ColaVacia()) {
            nueva.AcolarPrioridad(cp1.Prioridad(),cp1.Primero());
            cp1.Desacolar();
        }

        while(!cp2.ColaVacia()) {
            nueva.AcolarPrioridad(cp2.Prioridad(),cp2.Primero());
            cp2.Desacolar();
        }

//        UtilidadesColaPrioridad.ImprimirColaPrioridad(nueva);
        UtilidadesColaPrioridad.ImprimirColaPrioridadConTexto("Nueva Cola: ", nueva);
    }
}
