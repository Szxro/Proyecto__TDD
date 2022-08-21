package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCafetera {

	@Test
	public void deberiaDevolverVerdaderoSiExisteCafe() {
		Cafetera cafetera = new Cafetera(10);
		
		String resultado = cafetera.hasCafe(5);
		
		assertEquals("Hay cafe", resultado);
	}

	@Test
	public void deberiaDevolverFalsoSiNoExisteCafe() {
		Cafetera cafetera = new Cafetera(10);
		
		String resultado = cafetera.hasCafe(11);
		
		assertEquals("No hay cafe", resultado);
	}
	
	@Test
	public void deberiaRestarCafe() {
		Cafetera cafetera = new Cafetera(10);
		
		cafetera.giveCafe(7);
		
		assertEquals(3, cafetera.getCantidadCafe());
	}
}
