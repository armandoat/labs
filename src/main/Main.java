package main;

public class Main {

	public static void main(String[] args) {
		
		int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		HappyNumber happyNumber = new HappyNumber();
		
		for (int i : numbersArray) {
			System.out.println(happyNumber.isHappyNumber(i) ? i + " is a Happy Number" : i + " isn't a Happy Number" );
		}

	}

}
