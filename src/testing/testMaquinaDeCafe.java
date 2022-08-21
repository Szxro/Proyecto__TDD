package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testMaquinaDeCafe {

	Cafetera cafetera;
	Vaso vasoPequeno;
	Vaso vasoMediano;
	Vaso vasoGrande;
	Azucarero azucarero;
	MaquinaDeCafe maquinaDeCafe;
	
	@Before
	public void setUp() {
		cafetera = new Cafetera(50);
		vasoPequeno = new Vaso(5, 10);
		vasoMediano = new Vaso(5, 20);
		vasoGrande = new Vaso(5, 30);
		azucarero = new Azucarero(20);
		
		maquinaDeCafe = new MaquinaDeCafe();
		maquinaDeCafe.setCafe(cafetera);
		maquinaDeCafe.setVasosPequenos(vasoPequeno);
		maquinaDeCafe.setVasosMedianos(vasoMediano);
		maquinaDeCafe.setVasosGrandes(vasoGrande);
		maquinaDeCafe.setAzucar(azucarero);
	}
	
	@Test
	public void deberiaDevolverUnVasoPequeno() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		assertEquals(maquinaDeCafe.vasosPequenos, vaso);
	}
	
	@Test
	public void deberiaDevolverUnVasoMediano() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");
		
		assertEquals(maquinaDeCafe.vasosMedianos, vaso);
	}
	
	@Test
	public void deberiaDevolverUnVasoGrande() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("grande");
		
		assertEquals(maquinaDeCafe.vasosGrandes, vaso);
	}
	
	@Test
	public void deberiaDevolverNoHayVasos() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 10, 2);
		
		assertEquals("No hay vasos", resultado);
	}
	
	@Test
	public void deberiaDevolverNoHayCafe() {
		
		cafetera = new Cafetera(5);
		maquinaDeCafe.setCafe(cafetera);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 2);
		
		assertEquals("No hay cafe", resultado);
	}
	
	@Test
	public void deberiaDevolverNoHayAzucar() {
		
		azucarero = new Azucarero(2);
		maquinaDeCafe.setAzucar(azucarero);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		assertEquals("No hay azucar", resultado);
	}
	
	@Test
	public void deberiaRestarCafe() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		int resultado = maquinaDeCafe.getCafe().getCantidadCafe();
		
		assertEquals(40, resultado);
	}
	
	@Test
	public void deberiaRestarVaso() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		int resultado = maquinaDeCafe.getVasosPequenos().getCantidadVasos();
		
		assertEquals(4, resultado);
	}
	
	@Test
	public void deberiaRestarAzucar() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		int resultado = maquinaDeCafe.getAzucar().getCantidadAzucar();
		assertEquals(17, resultado);
	}
	
	@Test
	public void deberiaDevolverFelicitaciones() {
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		assertEquals("Felicitaciones", resultado);
	}
}
