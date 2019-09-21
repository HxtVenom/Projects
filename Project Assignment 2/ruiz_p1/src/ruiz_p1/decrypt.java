package ruiz_p1;
import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		//Variable Declerations
		Scanner scnr = new Scanner(System.in);
		int arrayLength = 4;
		int[] inArray = new int[arrayLength];
		int input;
		
		//Input
		System.out.println("Please enter 4 digits: ");
		input = scnr.nextInt();
		
		//Split input into array
		inArray[3] = input % 10;
		inArray[2] = (input / 10) % 10;
		inArray[1] = (input / 100) % 10;
		inArray[0] = (input / 1000) % 10;
		
		//Decryption
		for(int i = 0; i < arrayLength; i++) {
			inArray[i] = (inArray[i] + 10) - 7;
		}
		
		//Output
		System.out.println("Decrypted: " + inArray[2] + inArray[3] + inArray[0] + inArray[1]);
		scnr.close();
		
	}

}
