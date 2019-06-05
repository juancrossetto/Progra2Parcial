package test_unitarios;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementaciones_dinamicas.ColaLD;
import implementaciones_estaticas.ColaPI;
import implementaciones_estaticas.ColaPU;

public class ColasTest {
	
    @Test
	public void colapu() {		
		ColaPU colapu = new ColaPU();
		colapu.InicializarCola();
		colapu.Acolar(2);
		colapu.Acolar(4);
		assertTrue(colapu.Primero() == 2);
		colapu.Desacolar();
		assertTrue(colapu.Primero() == 4);
		assertTrue(colapu.ColaVacia() == false);
		colapu.Desacolar();
		assertTrue(colapu.ColaVacia() == true);
	}
    
    @Test
	public void colapi() {
		ColaPI colapi = new ColaPI();
		colapi.InicializarCola();
		colapi.Acolar(2);
		colapi.Acolar(4);
		assertTrue(colapi.Primero() == 2);
		colapi.Desacolar();
		assertTrue(colapi.Primero() == 4);
		assertTrue(colapi.ColaVacia() == false);
		colapi.Desacolar();
		assertTrue(colapi.ColaVacia() == true);
	}
    
    @Test
	public void colald() {
		ColaLD colald = new ColaLD();
		colald.InicializarCola();
		colald.Acolar(2);
		colald.Acolar(4);
		assertTrue(colald.Primero() == 2);
		colald.Desacolar();
		assertTrue(colald.Primero() == 4);
		assertTrue(colald.ColaVacia() == false);
		colald.Desacolar();
		assertTrue(colald.ColaVacia() == true);
	}
	

}
