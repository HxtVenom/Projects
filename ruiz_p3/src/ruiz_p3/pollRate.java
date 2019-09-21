package ruiz_p3;
import java.util.Scanner;

public class pollRate {

	public static void main(String[] args) {
		//Variable Declarations
		Scanner scnr = new Scanner(System.in);
		int numTopics = 5;
		int numRatings = 10;
		String[] topics = new String[numTopics];
		int[][] rate = new int[numTopics][numRatings];
		double[] average = new double[numTopics];
		int[] total = new int[numTopics];
		int numUsers;
		int x;
		int highestPoint, lowestPoint, highestID, lowestID;
		
		//Initializing Topics
		topics[0] = "Effects of climate change";
		topics[1] = "Morality of AI for surveillance";
		topics[2] = "Modern Warfare Beta";
		topics[3] = "Restaurant Industry work";
		topics[4] = "COP 3330 w/ Prof Hollander";
		
		//Initializing Points/ID
		highestPoint = -1;
		lowestPoint = 99999;
		highestID = -1;
		lowestID = -1;
		
		//Initializing Topic Ratings
		for(int i = 0; i < numTopics; i++) {
			for(int j = 0; j < numRatings; j++) {
				rate[i][j] = 0;
			}
		}
		
		//Getting number of users participating in poll
		System.out.println("Enter number of users participating: ");
		numUsers = scnr.nextInt();
		
		//Getting ratings from users
		for(int i = 0; i < numUsers; i++) {
			for(int j = 0; j < numTopics; j++) {
				System.out.println("Person " + (i + 1) + ": Rate " + topics[j] + " from 1 to " + numRatings + ":");
				x = scnr.nextInt();
				
				while((x < 1) || (x > 10)) {
					System.out.println("Invalid Entry, 1-10 only. Please try again: ");
					x = scnr.nextInt();
				}
				
				rate[j][x - 1] = rate[j][x - 1] + 1;
			}
		}
		
		scnr.close(); //Closing Scanner
		
		//Calculating Averages and Totals
		for(int i = 0; i < numTopics; i++) {
			for(int j = 0; j < numRatings; j++) {
				total[i] = (rate[i][j] * (j + 1)) + total[i];
			}
			average[i] = (double)total[i] / numUsers;
			
			//Calculating highest/lowest
			if(total[i] > highestPoint) {
				highestPoint = total[i];
				highestID = i;
			}
			if(total[i] < lowestPoint) {
				lowestPoint = total[i];
				lowestID = i;
			}
		}
		
		
		
		//Outputs
		for(int i = 0; i < numTopics; i++) {
			//Print top of table when first outputting final results
			if(i == 0) {
				System.out.println("Topic\t\t\t\t\t\t 1 \t 2\t 3\t 4\t 5\t 6\t 7\t 8\t 9\t 10\t Average");
			}
			System.out.print((i + 1) + ". " + topics[i] + "\t\t\t"); //PRINT TOPIC NAME
			//PRINT TOPIC RATING
			for(int j = 0; j < numRatings; j++) {
				System.out.print(rate[i][j] + "\t");
			}
			System.out.printf("%.2f", average[i]); //PRINT TOPIC AVERAGE
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Highest Points: " + topics[highestID] + " with " + highestPoint + " points");
		System.out.println("Lowest Points: " + topics[lowestID] + " with " + lowestPoint + " points");
		
	}

}
