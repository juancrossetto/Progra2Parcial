# Progra2Parcial
Repo with files to do the parcial.

PARCIAL 2 Puntos:
TP1:
	4 C   							YA ESTA (Preguntar si esta bien porque no entendi lo de auxiliar)
	4 E 							YA ESTA (Lo saque del PDF)
	4 F 							YA ESTA
	6 COMPLETO(A Y B)			A:	YA ESTA 		
								B:  YA ESTA
TP2: 6 COMPLETO

TP3: 
	1 B
	1 D
	2 A
	3 (TODO HASTA EL D INCLUSIVE)
	5 COMPLETO

TP4:
	3 (DESDE EL 'A' HASTA EL 'L')


T:\ SRC (lo vamos a llamar con nuestro nombre) --> API
											   --> Implementaciones		
											   --> Tools
						 					   --> Parcial --> Ej1: Java
							     						   --> Ej2: Java

EN EL EXAMEN UTILIZAR SOLO LAS IMPLEMENTACIONES DINAMICAS(RECOMENDO)


3-C
public ConjuntoTDA DifSimetrica(Conjunto A, Conjunto B){
	Metodos m = new Metodos();
	ConjuntoTDA ds = m.Dif(m.Union(A,B), m.Intersec(A,B));
	return ds;
}


5.1
5.1	CLAVES	VALORES
A	Unión	Unión
B	Unión	Intersección
C	Intersección	Unión
D	Intersección	Intersección







5-1.A
public DiccionarioMultipleTDA DSDM (DiccionarioMultipleTDA d1, DiccionarioMultipleTDA d2){
	DiccionarioMultipleTDA dm= new DiccionarioMultipleLD();
	dm.InicializarDiccionario();
	Metodos m = new Metodos();
	//Tengo que tomar las claves de uno y del otro y luego unirlas
	ConjuntoTDA claves = m.Union(d1.claves(), d2.claves());
	While(¡claves.conjuntoVacio()){
	int clave = Claves.elegir();
	ConjuntoTDA valores = m.Union(d1.recuperar(clave), d2.recuperar(clave));
	While(¡valor.ConjuntoVacio()){
		Int valor = valores.Elegir()
		Dm.agregar(clave,valor);
Valores.sacar(valor);
}
		claves.sacar(clave)
}
	return dm;
}


5. algo
Public DiccionarioMultipleTDA dsdm(DiccionarioSimple DS){
	DiccionarioMultipleTDA dm = new DiccionarioLD();
	Dm.InicializarDiccionario();
	ConjuntoTDA claves = ds.claves();
	While(¡claves.conjuntovacio()){
	Int clave = clave.elegir();
	Int valor = ds.recuperar(clave);
	Dm.agregar(valor,clave);
	Clave.sacar(clave);
}
	Return dm;
}

Como identificar arboles iguales
Public boolean ArbolesIguales(ABBTDA a, ABBTDA b){
Boolean result = false;

Return result;
}
