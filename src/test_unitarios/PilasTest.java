package test_unitarios;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementaciones_dinamicas.PilaLD;
import implementaciones_estaticas.PilaTF;
import implementaciones_estaticas.PilaTI;

public class PilasTest {

	@Test
	public void pilatf() {
		PilaTF pilatf = new PilaTF();
		pilatf.InicializarPila();
		pilatf.Apilar(1);
		pilatf.Apilar(2);
		assertTrue(pilatf.Tope() == 2);
		pilatf.Desapilar();
		assertTrue(pilatf.Tope() == 1);
		pilatf.Desapilar();
		assertTrue(pilatf.PilaVacia() == true);
	}

	@Test
	public void pilati() {
		PilaTI pilati = new PilaTI();
		pilati.InicializarPila();
		pilati.Apilar(1);
		pilati.Apilar(2);
		assertTrue(pilati.Tope() == 2);
		pilati.Desapilar();
		assertTrue(pilati.Tope() == 1);
		pilati.Desapilar();
		assertTrue(pilati.PilaVacia() == true);
	}

	@Test
	public void pilald() {
		PilaLD pilald = new PilaLD();
		pilald.InicializarPila();
		pilald.Apilar(1);
		pilald.Apilar(2);
		assertTrue(pilald.Tope() == 2);
		pilald.Desapilar();
		assertTrue(pilald.Tope() == 1);
		pilald.Desapilar();
		assertTrue(pilald.PilaVacia() == true);
	}

}
