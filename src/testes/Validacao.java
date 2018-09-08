package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Validacao {

	@Test
	public void firstTest() {
		
		int numero = 64;
		short resultadoExperado = 1;
		
		assertEquals(numero, resultadoExperado);
	}

}
