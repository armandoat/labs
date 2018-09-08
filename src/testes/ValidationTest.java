package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * O objetivo do teste eh demonstrar algumas etapas de construcao do algoritimo numeros felizes 
 * iniciando com uma falha.  
 * 
 * @author ATanaka
 *
 */
public class ValidationTest {

	/**
	 * O primeiro teste apresenta uma falha.
	 */
	@Test
	public void firstTest() {
		
		int number = 8;
		short expectedResult = 1; 

		assertEquals(Math.pow(number, 2), expectedResult, 0.00001);
	}
	
	/**
	 * Segundo teste apresenta uma evolucao da implementacao do algoritimo, porem ainda falha.
	 */
	@Test
	public void secondTest() {
		
		int number = 3;
		char[] numbersArray = Character.toChars((int) Math.pow(number, 2));
		short expectedResult = 1;
		
		assertTrue("Tamanho é maior do que 2", numbersArray.length > 2);
		assertEquals(Math.pow(number, 2), expectedResult, 0.00001);
	}

	/**
	 * Terceiro teste apresenta uma evolucao da implementacao do algoritimo, porem ainda falha.
	 */
	@Test
	public void thirdTest() {
		
		int number = 4;
		char[] numbersArray = new Long((long) Math.pow(number, 2)).toString().toCharArray();
		short expectedResult = 1;
		
		assertTrue("Tamanho é maior do que 2", numbersArray.length >= 2);
		assertEquals("Eh um numero feliz", Math.pow(number, 2), expectedResult, 0.00001);
	}

	/**
	 * Quarto teste apresenta uma evolucao da implementacao do algoritimo, porem ainda falha.
	 */
	@Test
	public void fourthTest() {
		
		int number = 4;
		char[] numbersArray = new Long((long) Math.pow(number, 2)).toString().toCharArray();
		short expectedResult = 1;
		long sum = 0;
		
		assertTrue("Tamanho é maior do que 2", numbersArray.length >= 2);
		if(numbersArray.length >= 2) {
			for (char c : numbersArray) {
				sum += Math.pow((int) c, 2);
			}
		}
		assertEquals("Eh um numero feliz", sum, expectedResult);
	}
	
	/**
	 * Quinto teste apresenta uma evolucao da implementacao do algoritimo, porem ainda falha.
	 */
	@Test
	public void fifthTest() {
		
		int number = 4;
		char[] numbersArray = new Long((long) Math.pow(number, 2)).toString().toCharArray();
		short expectedResult = 1;
		long sum = 0;
		
		assertTrue("Tamanho é maior do que 2", numbersArray.length >= 2);
		if(numbersArray.length >= 2) {
			for (char c : numbersArray) {
				sum += Math.pow(Character.getNumericValue(c), 2);
			}
		}
		assertEquals("Eh um numero feliz", sum, expectedResult);
	}
	
	/**
	 * Sexto teste apresenta um caso em que encontrou um numero feliz.
	 */
	@Test
	public void isAHappyNumberTest() {
		
		int number = 7;
		short expectedResult = 1;
		
		assertEquals(number + " eh um numero feliz", this.calculateHappyNumber(number), expectedResult);
	}
	
	/**
	 * Sexto teste apresenta um caso em que encontrou um numero feliz.
	 */
	@Test
	public void isNotAHappyNumberTest() {
		
		int number = 4;
		short expectedResult = 1;
		
		assertNotEquals(number + " não eh um numero feliz", this.calculateHappyNumber(number), expectedResult);
	}

	/**
	 * Implementacao do algoritimo que calcula um numero que passarah pela verificacao de numero feliz.
	 * 
	 * @param number
	 * @return
	 */
	private long calculateHappyNumber(int number) {

		long result = (long) Math.pow(number, 2);
		char[] numbersArray = null;
		
		while(result >= 10) {
			numbersArray = new Long(result).toString().toCharArray();
			result = 0;
			if(numbersArray.length >= 2) {
				for (char c : numbersArray) {
					result += Math.pow(Character.getNumericValue(c), 2);
				}
			}
		}
		
		return result;
	}
}
