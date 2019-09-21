package ruiz_p2;
import java.util.Scanner;

public class bmiCalc {

	public static void main(String[] args) {
		//Variable Declarations
		Scanner scnr = new Scanner(System.in);
		double weight, height;
		double bmi = 0;
		String input;
		int i = 0;
		
		//Input
		System.out.println("----Welcome to the BMI calculator----");
		System.out.println("Enter 'K' for kilos/meters or 'L' for pounds/inches: ");
		
		while(i == 0) {
			input = scnr.next();
			if(input.equalsIgnoreCase("K")) {
				System.out.println("Enter height in meters: ");
				height = scnr.nextDouble();
				System.out.println("Enter weight in kilograms: ");
				weight = scnr.nextDouble();
				
				bmi = (weight) / (height * height);
				i++;
			}else if(input.equalsIgnoreCase("L")) {
				System.out.println("Enter height in inches: ");
				height = scnr.nextDouble();
				System.out.println("Enter weight in pounds: ");
				weight = scnr.nextDouble();
				
				bmi = (703 * weight) / (height * height);
				i++;
			}else {
				System.out.println("Invalid Input, try again (K or L): ");
			}
		}
		
		System.out.printf("Your BMI: %.2f\n\n", bmi);
		System.out.println("-----------------BMI CHART----------------");
		System.out.printf("BMI VALUE\t|\t Category\n");
		System.out.printf("<18.5\t\t|\t Underweight\n");
		System.out.printf("18.5-24.9\t|\t Normal Weight\n");
		System.out.printf("25-29.9\t\t|\t Overweight\n");
		System.out.printf(">30\t\t|\t Obesity\n");
		
		scnr.close();
	}

}
