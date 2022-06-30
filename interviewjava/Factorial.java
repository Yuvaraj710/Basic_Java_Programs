package interviewjava;

public class Factorial {

	public static void main(String[] args) {

		int num = 4, fact =1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact * i ;
		}
		
		System.out.println("The Factorial of "+ num + " is : " + fact);
	}

}
