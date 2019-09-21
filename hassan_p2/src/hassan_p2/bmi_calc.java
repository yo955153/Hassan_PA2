package hassan_p2;

import java.util.Scanner;

public class bmi_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int unit;
		double weight, height, bmi;
		
		System.out.print("Type 1 for Customary and 2 for SI units: ");
		
		unit = scnr.nextInt();
		
		if(unit == 1)
		{
			System.out.print("Enter weight in pounds: ");
			weight = scnr.nextDouble();
			System.out.print("Enter height in inches: ");
			height = scnr.nextDouble();
			
			bmi = (703 * weight) / (height * height);
			
			System.out.println(("\nBMI: " + bmi));
			
			System.out.println("\nUnderweight = <18.5");
			System.out.println("Normal weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		}
		
		else if(unit == 2)
		{
			System.out.print("Enter weight in kilograms: ");
			weight = scnr.nextDouble();
			System.out.print("Enter height in meters: ");
			height = scnr.nextDouble();
			
			bmi = (weight) / (height * height);
			
			System.out.println(("\nBMI: " + bmi));
			System.out.println("\nUnderweight = <18.5");
			System.out.println("Normal weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		}
		
		else
			System.out.println("Not a valid choice");
	
	}

}
