package main;

public class HappyNumber {

	/**
	 * Default constructor
	 */
	public HappyNumber() {
	}
	
	/**
	 * Implementacao do algoritimo que calcula um numero que passarah pela verificacao de numero feliz.
	 * 
	 * @param number
	 * @return
	 */
	private long calculate(int number) {
		
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
	
	/**
	 * Verificar se o numero informado como parametro eh um numero feliz, caso for retorna TRUE senão FALSE 
	 * 
	 * @param number
	 * @return
	 */
	public boolean isHappyNumber(int number) {
		return this.calculate(number) == 1;
	}
}
