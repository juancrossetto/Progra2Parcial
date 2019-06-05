package test_unitarios;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementaciones_dinamicas.ColaPrioridadLD;
import implementaciones_estaticas.ColaPrioridadAO;
import implementaciones_estaticas.ColaPrioridadDA;

public class ColasPrioridadTest {
	
	@Test
	public void colaprioridadda() {	
		ColaPrioridadDA colaprioridadda = new ColaPrioridadDA();
		colaprioridadda.InicializarCola();
		colaprioridadda.AcolarPrioridad(12, 1);
		colaprioridadda.AcolarPrioridad(44, 4);
		colaprioridadda.AcolarPrioridad(11, 3);
		colaprioridadda.AcolarPrioridad(78, 8);
		colaprioridadda.AcolarPrioridad(79, 8);
		assertTrue(colaprioridadda.Prioridad() == 8);
		assertTrue(colaprioridadda.Primero() == 78);
		colaprioridadda.Desacolar();
		assertTrue(colaprioridadda.Prioridad() == 8);
		assertTrue(colaprioridadda.Primero() == 79);
	}
	
	public void colaprioridadao() {
		ColaPrioridadAO colaprioridadao = new ColaPrioridadAO();
		colaprioridadao.InicializarCola();
		colaprioridadao.AcolarPrioridad(12, 1);
		colaprioridadao.AcolarPrioridad(44, 4);
		colaprioridadao.AcolarPrioridad(11, 3);
		colaprioridadao.AcolarPrioridad(78, 8);
		colaprioridadao.AcolarPrioridad(79, 8);
		assertTrue(colaprioridadao.Prioridad() == 8);
		assertTrue(colaprioridadao.Primero()== 78);
		colaprioridadao.Desacolar();
		assertTrue(colaprioridadao.Prioridad()== 8);
		assertTrue(colaprioridadao.Primero()== 79);
	}
	
	public void colaprioridadld() {
		ColaPrioridadLD colaprioridadld = new ColaPrioridadLD();
		colaprioridadld.InicializarCola();
		colaprioridadld.AcolarPrioridad(12, 1);
		colaprioridadld.AcolarPrioridad(44, 4);
		colaprioridadld.AcolarPrioridad(11, 3);
		colaprioridadld.AcolarPrioridad(78, 8);
		colaprioridadld.AcolarPrioridad(79, 8);
		assertTrue(colaprioridadld.Prioridad() == 8 );
		assertTrue(colaprioridadld.Primero()== 78);
		colaprioridadld.Desacolar();
		assertTrue(colaprioridadld.Prioridad()== 8);
		assertTrue(colaprioridadld.Primero()== 79);
	}

}
