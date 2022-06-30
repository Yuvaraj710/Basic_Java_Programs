package interviewjava;

import java.util.Scanner;

public class SwapTwoNumbersNoThirdVariable {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int n1 = s.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int n2 = s.nextInt();
		
		System.out.println("Before Swapping : N1 = " + n1 +" N2 = " +n2);
		
		n1 = n1+n2;  // n1 = 5+7= 12
		n2 = n1-n2;  // n2 = 12-7 = 5
		n1 = n1-n2;  // n1 = 12-5 = 7
		
		System.out.println("\nAfter Swapping : N1 = " + n1 +" N2 = " +n2);
	}

}
