package Java_intro;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int userInput = sc.nextInt();
		sc.close();
		
		int temp = userInput;
		int last = 0,digit = 0,sum =0;
		
		while(temp > 0) {
			temp = temp / 10;
			digit++;
		}
		
		temp = userInput;
		while(temp > 0) {
			last = temp % 10;
			temp = temp / 10;
			sum = sum + (int)(Math.pow(last,digit));
		}
		
		if(sum == userInput) {
			System.out.println("The given number is armstrong");
		}else {
			System.out.println("The given number is not armstrong");
		}
		
		
		

	}

}
