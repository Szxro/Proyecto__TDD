package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAzucarero {
	
	Azucarero azucarero;
	
	@Before
	public void setUp(){
		azucarero = new Azucarero(10);
	}
	
	@Test
	public void deberiaDevolverVerdaderoSiHaySuficienteAzucar() {
		
		String resultado = azucarero.hasAzucar(5);
		
		assertEquals("Hay azucar", resultado);
	}
	
	@Test
	public void deberiaDevolverFalsoSiNoHaySuficienteAzucar() {
		
		String resultado = azucarero.hasAzucar(15);
		
		assertEquals("No hay azucar", resultado);
	}
	
	@Test
	public void deberiaRestarAzucar() {
		
		azucarero.giveAzucar(5);
		
		assertEquals(5, azucarero.getCantidadAzucar());
	}
}
