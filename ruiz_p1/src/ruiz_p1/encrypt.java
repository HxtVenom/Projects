package ruiz_p1;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		//Variable Declarations
		Scanner scnr = new Scanner(System.in);
		int input;
		int one, two, three, four;
		
		//Input
		System.out.println("Enter 4 digit integer: ");
		input = scnr.nextInt();
		
		//Split input into individual digits
		four = input % 10;
		three = (input / 10) % 10;
		two = (input / 100) % 10;
		one = (input / 1000) % 10;
		
		//Encryption
		one = (one + 7) % 10;
		two = (two + 7) % 10;
		three = (three + 7) % 10;
		four = (four + 7) % 10;
		
		//Output
		System.out.println("Encrypted: " + three + four + one + two);

	}
	
}
