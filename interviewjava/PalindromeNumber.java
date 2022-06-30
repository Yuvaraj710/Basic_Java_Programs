package interviewjava;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 15151, rem, result=0, temp = num;
		
		while(num > 0)
		{
			rem = num % 10;
			result = (result*10) + rem ;
			num = num/10;
		}
		
		if(result == temp)
		{
			System.out.println("The Given Number is a Polindrome Number");
		}
		else
		{
			System.out.println("The Given Number is not a polindrome Number");
		}

	}

}
