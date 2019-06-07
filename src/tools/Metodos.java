package tools;

import API.*;
import implementaciones_dinamicas.*;
import implementaciones_estaticas.*;

public class Metodos {

	public void MostrarColaPrioridad(ColaPrioridadTDA o){
		
		if(!o.ColaVacia()){
			 ColaPrioridadTDA copia = new ColaPrioridadDA();
			 copia.InicializarCola();
			 while (!o.ColaVacia()){
				 System.out.println(o.Primero());
				 copia.AcolarPrioridad(o.Primero(), o.Prioridad());
				 o.Desacolar();
			 }
			 while (!copia.ColaVacia()){
				 o.AcolarPrioridad(copia.Primero(), copia.Prioridad());
				 copia.Desacolar();
			 }
		} else
			System.out.println("Cola vacía");
	}
	
	public ConjuntoTDA Union(ConjuntoTDA C1, ConjuntoTDA C2){	//Conserva los conjuntos C1 y C2
		ConjuntoTDA CUnion = new ConjuntoLD();
		if(!C1.ConjuntoVacio() || !C2.ConjuntoVacio()){
			
			CUnion.InicializarConjunto();
			ConjuntoLD copia = new ConjuntoLD();
			copia.InicializarConjunto();
			 
			 while (!C1.ConjuntoVacio()){
				 copia.Agregar(C1.Elegir());
				 CUnion.Agregar(C1.Elegir());
				 C1.Sacar(C1.Elegir());
			 }
			 while (!copia.ConjuntoVacio()){
				 C1.Agregar(copia.Elegir());
				 copia.Sacar(copia.Elegir());
			 }
			 while (!C2.ConjuntoVacio()){
				 copia.Agregar(C2.Elegir());
				 CUnion.Agregar(C2.Elegir());
				 C2.Sacar(C2.Elegir());
			 }
			 while (!copia.ConjuntoVacio()){
				 C2.Agregar(copia.Elegir());
				 copia.Sacar(copia.Elegir());
			 }
		}
		return CUnion;
	}
	
	public ConjuntoTDA Diferencia(ConjuntoTDA C1, ConjuntoTDA C2){
		
		ConjuntoTDA CDiferencia = new ConjuntoLD();
		if(!C1.ConjuntoVacio() || !C2.ConjuntoVacio()){
			
			CDiferencia.InicializarConjunto();
			ConjuntoLD copia = new ConjuntoLD();
			copia.InicializarConjunto();
			 
			 while (!C1.ConjuntoVacio()){
				 copia.Agregar(C1.Elegir());
				 if (!C2.Pertenece(C1.Elegir())){
					 CDiferencia.Agregar(C1.Elegir());
					 C1.Sacar(C1.Elegir());
				 }
				 else {
					 copia.Agregar(C1.Elegir());
					 C1.Sacar(C1.Elegir()); 
				 }
			 }
			 while (!copia.ConjuntoVacio()){
				 C1.Agregar(copia.Elegir());
				 copia.Sacar(copia.Elegir());
			 } 
		}
		return CDiferencia;
	}
	
	public ConjuntoTDA diferenciaSimetricaSinOperaciones(ConjuntoTDA c1, ConjuntoTDA c2){
		ConjuntoTDA resultado = new ConjuntoLD();
			while (!c1.ConjuntoVacio()){
				int elemento = c1.Elegir();
				if (!c2.Pertenece(elemento)){
					resultado.Agregar(elemento); 
				}
				else{ 
					c2.Sacar(elemento);
				}
				c1.Sacar(elemento); 
			}
			while (!c2.ConjuntoVacio()){ 
				int elemento = c2.Elegir();
				resultado.Agregar(elemento);
				c2.Sacar(elemento); 
			}
			return resultado;
	}
	
	public boolean SonConjuntosIguales(ConjuntoTDA c1, ConjuntoTDA c2){
		int elemento;
		boolean sonIguales = true;
		while (!c1.ConjuntoVacio() && !c2.ConjuntoVacio() && sonIguales){
			elemento = c1.Elegir();
			if (!c2.Pertenece(elemento)){ 
				sonIguales = false ;
			}
			else{ 
				c1.Sacar(elemento); c2.Sacar(elemento);
			} 
		}	
		if (c1.ConjuntoVacio() && c2.ConjuntoVacio()){ 
			return true;
		}else{
			return false ;
		} 
	}
	
	public ConjuntoTDA UnirConjuntos(ConjuntoTDA c1, ConjuntoTDA c2){	
		ConjuntoTDA resultado = new ConjuntoLD();
			while (!c1.ConjuntoVacio()){
				resultado.Agregar(c1.Elegir());
				c1.Sacar(c1.Elegir());
			}
			while (!c2.ConjuntoVacio()){
				resultado.Agregar(c2.Elegir());
				c2.Sacar(c2.Elegir());
			}
			return resultado;
	}
	
	//Metodos ABB
	public void preOrder(ABBTDA a){ 
		if (!a.ArbolVacio()){
			System.out.println(a.Raiz()); 
			preOrder(a.HijoIzq()); 
			preOrder(a.HijoDer());
		}
	}
	public void inOrder(ABBTDA a){ 
		if (!a.ArbolVacio()){
			inOrder(a.HijoIzq()); 
			System.out.println(a.Raiz()); 
			inOrder(a.HijoDer());
		}
	}
	public void postOrder(ABBTDA a){ 
		if (!a.ArbolVacio()){
			postOrder(a.HijoIzq()); 
			postOrder(a.HijoDer()); 
			System.out.println(a.Raiz());
		} 
	}

}
