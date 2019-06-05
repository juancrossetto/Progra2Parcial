package test_unitarios;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementaciones_dinamicas.ConjuntoLD;
import implementaciones_estaticas.ConjuntoTA;

public class ConjuntosTest {
	
	@Test
	public void conjuntota() {	
		
		ConjuntoTA conjuntota = new ConjuntoTA();
		conjuntota.InicializarConjunto();
		assertTrue(conjuntota.ConjuntoVacio() == true);
		conjuntota.Agregar(4);
		conjuntota.Agregar(12);
		conjuntota.Agregar(4);
		assertTrue(conjuntota.ConjuntoVacio() == false);
		assertTrue(conjuntota.Elegir()== 12);
		assertTrue(conjuntota.Pertenece(4)== true);
		conjuntota.Sacar(12);
		assertTrue(conjuntota.Pertenece(4)== true);
		conjuntota.Sacar(4);
		assertTrue(conjuntota.Pertenece(4)== false);
		
	}
	
	@Test
	public void conjuntold() {	
		
		ConjuntoLD conjuntold = new ConjuntoLD();
		conjuntold.InicializarConjunto();
		assertTrue(conjuntold.ConjuntoVacio()== true);
		conjuntold.Agregar(4);
		conjuntold.Agregar(12);
		conjuntold.Agregar(4);
		assertTrue(conjuntold.ConjuntoVacio()== false);
		assertTrue(conjuntold.Elegir() == 12);
		assertTrue(conjuntold.Pertenece(4)== true);
		conjuntold.Sacar(12);
		assertTrue(conjuntold.Pertenece(4)== true);
		conjuntold.Sacar(4);
		assertTrue(conjuntold.Pertenece(4)== false);
		
	}

}
