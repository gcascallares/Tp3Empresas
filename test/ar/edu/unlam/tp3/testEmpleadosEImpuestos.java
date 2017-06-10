package ar.edu.unlam.tp3;

import static org.junit.Assert.*;

import org.junit.Test;

public class testEmpleadosEImpuestos {

	@Test
	public void testQuecalculaimpuestosAUnGerente() {
		Gerente miGerente = new Gerente("Juan","02/11/1975",11000,10,"gerente","produccion");
		ServicioImpuesto ImpuestoGerente = new ServicioImpuesto();
		miGerente.brindarDetalles();
		assertEquals(9900,ImpuestoGerente.obtenerImpuesto(miGerente),0.01);
	}
	
	@Test
	public void testQuecalculaimpuestosAUnIngeniero() {
		Ingeniero miIngeniero = new Ingeniero("Pablo","05/12/1985",10000,"Ingeniero","produccion");
		ServicioImpuesto ImpuestoIngeniero = new ServicioImpuesto();
		miIngeniero.brindarDetalles();
		assertEquals(10000,ImpuestoIngeniero.obtenerImpuesto(miIngeniero),0.01);
	}
	
	@Test
	public void testQuecalculaimpuestosAUnDirector() {
		Director miDirector = new Director("Rodolfo","20/05/1950",20000,1,"director","general",1000);
		ServicioImpuesto ImpuestoDirector = new ServicioImpuesto();
		miDirector.brindarDetalles();
		assertEquals(18000,ImpuestoDirector.obtenerImpuesto(miDirector),0.01);
	}
	
	@Test
	public void testQuecalculaimpuestosAUnSecretaria() {
		Secretaria miSecretaria = new Secretaria("Ana","18/02/1990",8000,"secretaria","administraciòn");
		ServicioImpuesto ImpuestoSecretaria = new ServicioImpuesto();
		miSecretaria.brindarDetalles();
		assertEquals(8000,ImpuestoSecretaria.obtenerImpuesto(miSecretaria),0.01);
	}
}
