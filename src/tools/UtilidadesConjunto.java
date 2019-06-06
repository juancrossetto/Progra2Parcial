package tools;

import API.ConjuntoTDA;
import implementaciones_dinamicas.ConjuntoLD;
import implementaciones_estaticas.*;

public class UtilidadesConjunto {


    public static ConjuntoTDA Interseccion(ConjuntoTDA origen, ConjuntoTDA destino){
    	//Recibe dos conjuntos, y devuelve un conjunto con los valores que existen en ambos 
		ConjuntoTDA interseccion = new ConjuntoTA();
		interseccion.InicializarConjunto();
		
		ConjuntoTDA auxOrigen=new ConjuntoTA();
        ConjuntoTDA auxDestino=new ConjuntoTA();
        auxOrigen.InicializarConjunto();
        auxDestino.InicializarConjunto();
        CopiarConjunto(origen,auxOrigen);
        CopiarConjunto(destino,auxDestino);
        
		
		int dato = 0;
		while (!auxOrigen.ConjuntoVacio()) {
			dato = auxOrigen.Elegir();
			auxOrigen.Sacar(dato);
			if (auxDestino.Pertenece(dato))
				interseccion.Agregar(dato);			
		}		
		return interseccion;
    }

    public static ConjuntoTDA Union(ConjuntoTDA origen, ConjuntoTDA destino){

    	//Recibe dos conjuntos y devuelve un conjunto con los valores de ambos
		ConjuntoTDA union = new ConjuntoTA();
		union.InicializarConjunto();
		
		ConjuntoTDA auxOrigen=new ConjuntoTA();
        ConjuntoTDA auxDestino=new ConjuntoTA();
        auxOrigen.InicializarConjunto();
        auxDestino.InicializarConjunto();
        CopiarConjunto(origen,auxOrigen);
        CopiarConjunto(destino,auxDestino);
        
		int dato = 0;
		while (!auxOrigen.ConjuntoVacio()) {
			dato = auxOrigen.Elegir();
			auxOrigen.Sacar(dato);
			union.Agregar(dato);			
		}
		while (!auxDestino.ConjuntoVacio()) {
			dato = auxDestino.Elegir();
			auxDestino.Sacar(dato);
			union.Agregar(dato);			
		}		
		return union;
    }

    //Esto seria diferencia simetrica. Tengo que hacer la diferencia de A a Bt
    public static ConjuntoTDA Diferencia(ConjuntoTDA origen, ConjuntoTDA destino){

    	//Recibe dos conjuntos, devuelve un conjunto con los elementos que estan en c1 pero no en c2
		ConjuntoTDA diferencia = new ConjuntoTA();
		diferencia.InicializarConjunto();
		
		ConjuntoTDA auxOrigen=new ConjuntoTA();
        ConjuntoTDA auxDestino=new ConjuntoTA();
        auxOrigen.InicializarConjunto();
        auxDestino.InicializarConjunto();
        CopiarConjunto(origen,auxOrigen);
        CopiarConjunto(destino,auxDestino);
        
		int dato = 0;
		while (!auxOrigen.ConjuntoVacio()){
			dato = auxOrigen.Elegir();
			auxOrigen.Sacar(dato);
			if (!auxDestino.Pertenece(dato))
				diferencia.Agregar(dato);
		}		
		return diferencia;
    }
    
    public static ConjuntoTDA DiferenciaSimetrica (ConjuntoTDA conA, ConjuntoTDA conB){
		//Devuelve un conjunto con los elementos que existen en conA y no en conB, y viceversa 
		ConjuntoTDA res = new ConjuntoLD();
		res.InicializarConjunto();
		int dato;
		while (!conA.ConjuntoVacio()){
			dato = conA.Elegir();
			if (!conB.Pertenece(dato)){
				res.Agregar(dato);
			}
			else{
				conB.Sacar(dato);
			}
			conA.Sacar(dato);
		}
		while (!conB.ConjuntoVacio()){
			dato = conB.Elegir();
			res.Agregar(dato);
			conB.Sacar(dato);
		}
		return res;
	}
    
	public static ConjuntoTDA DiferenciaSimetricaConOpe(ConjuntoTDA conA, ConjuntoTDA conB) {
		//Devuelve un conjunto con los elementos que existen en conA y no en conB, y viceversa 
		ConjuntoTDA res = new ConjuntoLD();
		res.InicializarConjunto();
		ConjuntoTDA res2 = new ConjuntoLD();
		res2.InicializarConjunto();
		res = Union(conA, conB);
		res2 = Interseccion(conA, conB);
		res =  Diferencia(res, res2);		
		return res;
	}	
    
    public static void CopiarConjunto(ConjuntoTDA origen, ConjuntoTDA destino){
        ConjuntoTDA aux=new ConjuntoTA();
        aux.InicializarConjunto();

        while(!origen.ConjuntoVacio()){
            int elemento = origen.Elegir();
            aux.Agregar(elemento);
            destino.Agregar(elemento);
            origen.Sacar(elemento);
        }

        while(!aux.ConjuntoVacio()){
            int elegir = aux.Elegir();
            origen.Agregar(elegir);
            aux.Sacar(elegir);
        }
    }

    public static void ImprimirConjunto(ConjuntoTDA origen){

        ConjuntoTDA aux=new ConjuntoTA();
        aux.InicializarConjunto();

        CopiarConjunto(origen,aux);

        while(!aux.ConjuntoVacio()) {
            int elegir = aux.Elegir();
            System.out.println(elegir);
            aux.Sacar(elegir);
        }

    }
    
    public static boolean SonConjuntosIguales(ConjuntoTDA c1, ConjuntoTDA c2 ){
		int elemento;
		boolean sonIguales = true;
		while(!c1.ConjuntoVacio() && !c2.ConjuntoVacio() && sonIguales){
			elemento = c1.Elegir();
			if(!c2.Pertenece(elemento)){
				sonIguales = false;
			} else {
				c1.Sacar(elemento);
				c2.Sacar(elemento);
			}
		}
		if (c1.ConjuntoVacio() && c2.ConjuntoVacio()){
			return true;
		} else {
			return false;
		}
    }
    
  
  	public static void MostrarConjunto(ConjuntoTDA C){
  		if(!C.ConjuntoVacio()){
  			 ConjuntoLD copia = new ConjuntoLD();
  			 copia.InicializarConjunto();
  			 while (!C.ConjuntoVacio()){
  				 System.out.println(C.Elegir());
  				 copia.Agregar(C.Elegir());
  				 C.Sacar(C.Elegir());
  			 }
  			 while (!copia.ConjuntoVacio()){
  				 C.Agregar(copia.Elegir());
  				 copia.Sacar(copia.Elegir());
  			 }
  		} else
  			System.out.println("Conjunto Vacio");
  	}

}
