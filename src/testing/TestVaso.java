package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVaso {

	@Test
	public void deberiaDevolverVerdaderoSiExistenVasos() {
		Vaso vasospequenos = new Vaso(2, 10);
		
		String resultado = vasospequenos.hasVasos(1);
		
		assertEquals("Hay vasos", resultado);
	}
	
	@Test
	public void deberiaDevolverFalsoSiNoExistenVasos() {
		Vaso vasospequenos = new Vaso(1, 10);
		
		String resultado = vasospequenos.hasVasos(2);
		
		assertEquals("No hay vasos", resultado);
	}
	
	@Test
	public void deberiaRestarCantidadVasos() {
		Vaso vasospequenos = new Vaso(5, 10);
		
		vasospequenos.giveVasos(1);
		
		assertEquals(4, vasospequenos.getCantidadVasos());
	}

}
