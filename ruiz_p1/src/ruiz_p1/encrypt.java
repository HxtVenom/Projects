package ruiz_p1;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input;
		int one, two, three, four;
		
		System.out.println("Enter 4 digit integer: ");
		input = scnr.nextInt();
		
		four = input % 10;
		three = (input / 10) % 10;
		two = (input / 100) % 10;
		one = (input / 1000) % 10;
		
		System.out.println(input + " " + one + two + three + four); //Test Print
		
		//Encryption
		one = (one + 7) % 10;
		two = (two + 7) % 10;
		three = (three + 7) % 10;
		four = (four + 7) % 10;
		
		

	}
	
}
