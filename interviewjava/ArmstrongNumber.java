package interviewjava;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153, rem, result = 0, temp = num;
		
		while(num>0)
		{
			rem = num % 10 ;
			result = result + (rem*rem*rem);
			num = num / 10;
		}
		
		if(result == temp) {
			System.out.println("The Given Number is a Armstrong Number");
		} 
		else {
			System.out.println("The Given Number is NOT a Armstrong Number");
		}

	}

}
