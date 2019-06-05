package test_unitarios;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementaciones_dinamicas.DicSimpleL;
import implementaciones_estaticas.DicSimpleA;
import interfaces.ConjuntoTDA;

public class DiccionarioSimpleTest {
	
	@Test
	public void dicsimplea() {
		
		
		DicSimpleA dicsimplea = new DicSimpleA();
		dicsimplea.InicializarDiccionario();
		dicsimplea.Agregar(0, 132);
		assertTrue(dicsimplea.Recuperar(0) == 132);
		ConjuntoTDA objetoPivot = dicsimplea.Claves();
		assertTrue(objetoPivot.Elegir() == 0);
	}
	
	@Test
	public void dicsimplel() {
		
		DicSimpleL dicsimplel = new DicSimpleL();
		dicsimplel.InicializarDiccionario();
		dicsimplel.Agregar(0, 132);
		assertTrue(dicsimplel.Recuperar(0) == 132);
		ConjuntoTDA objetoPivot2 = dicsimplel.Claves();
		assertTrue(objetoPivot2.Elegir() == 0);
	}

}
