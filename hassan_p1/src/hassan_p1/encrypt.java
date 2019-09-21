package hassan_p1;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int input, dig1, dig2, dig3, dig4, temp, temp2;
		
		System.out.print("Enter an integer: ");
		
		input = scnr.nextInt();
		
		//Gathering values for each digit
		dig4 = input % 10;
		
		dig3 = (input % 100) / 10;
		
		dig2 = (input % 1000) / 100;
		
		dig1 = input / 1000;
		
		// Encrypting each digit
		dig4 = (dig4 + 7) % 10;
		dig3 = (dig3 + 7) % 10;
		dig2 = (dig2 + 7) % 10;
		dig1 = (dig1 + 7) % 10;

		// Swapping values 1st and 3rd digit
		temp = dig1;
		dig1 = dig3;
		dig3 = temp;
		
		// Swapping values 2nd and 4th digit
		temp2 = dig2;
		dig2 = dig4;
		dig4 = temp2;
		
		
		System.out.println("" + dig1 + dig2 + dig3 + dig4);
		
	}

}
