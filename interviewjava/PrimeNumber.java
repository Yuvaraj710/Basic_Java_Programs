package interviewjava;

public class PrimeNumber {

	public static void main(String[] args) {

		int num=5, temp=0;
		
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				temp = temp +1;
				break;
			}
		}
		
		if(temp==0) {
			System.out.println("The Given Number is a Prime Number");
		}
		else {
			System.out.println("The Given Number is not a Prime Number");
		}
	}

}
