package hassan_p1;

import java.util.Scanner;

public class decrypt {

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
		
		// Decrypting each digit
		dig4 = (dig4 + 3) % 10;
		dig3 = (dig3 + 3) % 10;
		dig2 = (dig2 + 3) % 10;
		dig1 = (dig1 + 3) % 10;
		
		// Swapping 1st and 3rd
		temp = dig3;
		dig3 = dig1;
		dig1 = temp;
		
		// Swapping 2nd and 4th
		temp2 = dig4;
		dig4 = dig2;
		dig2 = temp2;
		
		
		System.out.println("" + dig1 + dig2 + dig3 + dig4);

	}

}
