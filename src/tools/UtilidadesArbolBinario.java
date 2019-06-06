package tools;

import API.*;
import implementaciones_dinamicas.ConjuntoLD;

public class UtilidadesArbolBinario {

    public static boolean existeElementoEnABB(ABBTDA t, int x) {
	    if (t.ArbolVacio()) {
	        return false;
	    } else if(t.Raiz() == x) {
            return true;
        }
	    
        if (t.Raiz() > x) {
            return existeElementoEnABB(t.HijoIzq(), x);
        } else {
            return existeElementoEnABB(t.HijoDer(), x);
        }
    }
    
	public static boolean esHoja(ABBTDA t, int x) {
        if (t.ArbolVacio()) {
            return false;
        } else if (t.Raiz()==x && (t.HijoDer().ArbolVacio() && t.HijoIzq().ArbolVacio())) {
            return true;
        }
        if (t.Raiz() > x) {
            return esHoja(t.HijoIzq(), x);
        } else {
            return esHoja(t.HijoDer(), x);
        }
    }
	
	public static  int calcularProfundidad(ABBTDA t, int x) {
        if (t.ArbolVacio()) {
            return 0;
        } else if (t.Raiz()==x) {
            return 0;
        }
        if (t.Raiz() > x) {
            return (1 + calcularProfundidad(t.HijoIzq(), x));
        } else {
            return (1 + calcularProfundidad(t.HijoDer(), x));
        }
    }
	
	public static int menor(ABBTDA t) {
    	//Devuelve el menor elemento del árbol
		if (t.ArbolVacio())
			return 0;
		else if (t.HijoIzq().ArbolVacio())
			return t.Raiz();
		else
			return menor(t.HijoIzq());		
    }
	
	public static  int contarElementos(ABBTDA t) {
        if (t.ArbolVacio()) {
            return 0;
        }  else {
            return (1 + contarElementos(t.HijoIzq()) + contarElementos(t.HijoDer()));
        }
    }
	
	public static  int sumarElementos(ABBTDA t) {
        if (t.ArbolVacio()) {
            return 0;
        }  else {
            return (t.Raiz() + sumarElementos(t.HijoIzq()) + sumarElementos(t.HijoDer()));
        }
    }
	
	public static  int calcularCantidadHojas(ABBTDA t) {
        if (t.ArbolVacio()) {
            return 0;
        }  else if (t.HijoIzq().ArbolVacio() && t.HijoDer().ArbolVacio()) {
            return 1;
        }else {
            return calcularCantidadHojas(t.HijoIzq()) + calcularCantidadHojas(t.HijoDer());
        }
    }
	
	public static int CalcularAltura(ABBTDA t) {
		//devuelve el nivel de profundidad mayor del arbol
		if (t.ArbolVacio())
			return 0;
		else if (CalcularAltura(t.HijoIzq()) > CalcularAltura(t.HijoDer()))
			return 1 + CalcularAltura(t.HijoIzq());
		else
			return 1 + CalcularAltura(t.HijoDer());			
	}
	
	public static boolean ABBMismaForma(ABBTDA a, ABBTDA b) {
		//devuelve true si los dos arboles tienen las misma forma (misma produndidad y mismas hojas en cada hijo)
		if (a.ArbolVacio() && b.ArbolVacio())
			return true;
		else if (a.ArbolVacio() && !b.ArbolVacio() || !a.ArbolVacio() && b.ArbolVacio())
			return false;
		else 
			return ABBMismaForma(a.HijoDer(), b.HijoDer()) && ABBMismaForma(a.HijoIzq(), b.HijoIzq());		
	}
	
	public static boolean ABBIguales(ABBTDA a, ABBTDA b) {
		//true si los dos arboles son exactamente iguales
		if (a.ArbolVacio() && b.ArbolVacio())
			return true;
		else if (a.ArbolVacio() && !b.ArbolVacio() || !a.ArbolVacio() && b.ArbolVacio())
			return false;
		else if (a.Raiz()!=b.Raiz())
			return false;			
		else 
			return ABBIguales(a.HijoDer(), b.HijoDer()) && ABBIguales(a.HijoIzq(), b.HijoIzq());		
	}
	
	public static int ElementosEnNivel(ABBTDA a, int x) {
		//devuelve la cantidad de elementos que estan en un nivel
		if(a.ArbolVacio())
			return 0;
		else{
			if(x==0)
				return 1;
			else
				return ElementosEnNivel(a.HijoIzq(),x-1) + ElementosEnNivel(a.HijoDer(),x-1);
		}		
	}
	
	public static void InOrder(ABBTDA a){
		//muestra el arbol en orden
		if (!a.ArbolVacio ()){
			InOrder(a. HijoIzq());
			System.out.println(a.Raiz());
			InOrder(a. HijoDer());
		}
	}
	
	public static void PostOrder(ABBTDA a) {
		//muestra los hijos y despues el padre del arbol
		if (!a.ArbolVacio()){
			PostOrder(a.HijoIzq());
			PostOrder(a.HijoDer());
			System.out.println(a.Raiz());
		}
	}
	
	public static void PreOrder(ABBTDA a){
		//muestra el padre y despues los hijos del arbol
		if (!a.ArbolVacio()){
			System.out.println(a.Raiz());
			PreOrder(a.HijoIzq());
			PreOrder(a.HijoDer());
		}
	}
	
	
	
}
