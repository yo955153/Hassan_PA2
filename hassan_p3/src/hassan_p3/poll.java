package hassan_p3;

import java.util.Scanner;

public class poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int amount, max, min, i, j,  rate; 
		double num_rate;
		
		int[] sum = new int[5];
		double[] avg = new double[5];
		
		String[] topics = {"Politics", "Video Games", "Food", "Global Warming", "Movies"};
		int[][] responses = new int[5][10];
		String min_top, max_top;

		
		System.out.print("Enter amount of raters: ");
		amount = scnr.nextInt();
		
		
		// Loop for amount of raters
		for(i = 0; i < amount; i++)
		{
			System.out.println("\nRate these topics from 1(least important) to 10(most important): ");

			
			for(j = 0; j < 5; j++)
			{
				System.out.print("Enter rating for " + topics[j] + ": ");
				
				rate = scnr.nextInt();
				responses[j][rate - 1]++;
				
			}
			
		}
		
		// Loop to collect values for sums and average
		
		for(i = 0; i < 5; i++)
		{
			num_rate = 0;
			for(j = 0; j < 10; j++)
			{
				num_rate += responses[i][j];
				sum[i] += responses[i][j] * (j+1) ;
			}
			
			avg[i] = sum[i] / num_rate;
			
		}
		max = sum[0];
		min = sum[0];
		max_top = topics[0];
		min_top = topics[0];
		
		// Finding min and max values
		for(i = 0; i < 5; i++)
		{
			if(sum[i] > max)
			{
				max = sum[i];
				max_top = topics[i];
			}
			
			if(sum[i] < min)
			{
				min = sum[i];
				min_top = topics[i];
			}
			
		}
		System.out.println("\n\nRatings:");
		System.out.print("\t");
		for(i = 1; i <= 11; i++)
		{
			if(i == 11)
				System.out.print("\tAverage:");
				
			else
				System.out.print("\t" + i);
		}
		
		// Print topics
		System.out.println("\n--------------------------------------------------------------------------------------------------------");
		for(i = 0; i < 5 ; i++)
		{
			System.out.print(topics[i] + "\t");
			
			if(i == 2 || i == 4)
				System.out.print("\t");
			

			for(j = 0; j < 10 ; j++)
				System.out.print(responses[i][j] + "\t");
			
			System.out.printf("%.2f \n", avg[i]);
			
		}
		
		System.out.println("\nHighest points: " + max + " " + "(" + max_top + ")");
		System.out.println("Lowest points: " + min + " " + "(" + min_top + ")");
		
		
		

	}

}
