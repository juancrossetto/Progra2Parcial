package test_unitarios;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementaciones_dinamicas.DicMultipleL;
import implementaciones_estaticas.DicMultipleA;
import interfaces.ConjuntoTDA;

public class DiccionarioMultipleTest {
	
	@Test
	public void dicmultiplea () {
		DicMultipleA dicmultiplea = new DicMultipleA();
		dicmultiplea.InicializarDiccionario();
		dicmultiplea.Agregar(0, 154);
		dicmultiplea.Agregar(0, 489);
		
		ConjuntoTDA objetoAnidado = dicmultiplea.Recuperar(0);
		assertTrue(objetoAnidado.Elegir() == 489);
		objetoAnidado.Sacar(489);
		assertTrue(objetoAnidado.Elegir() == 154);
		
	}
	
	@Test
	public void dicmultiplel () {
		
		DicMultipleL dicmultiplel = new DicMultipleL();
		dicmultiplel.InicializarDiccionario();
		dicmultiplel.Agregar(0, 154);
		dicmultiplel.Agregar(0, 489);

		
		ConjuntoTDA objetoAnidado2 = dicmultiplel.Recuperar(0);
		assertTrue(objetoAnidado2.Elegir() == 154);
		objetoAnidado2.Sacar(154);
		assertTrue(objetoAnidado2.Elegir() == 489);
		
	}

}
