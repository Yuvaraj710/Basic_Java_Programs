package interviewjava;

public class SwapNoArithmeticOperator {
	
	public static void main(String[] args) {
		
		int n1 = 20, n2 = 30;
		
		System.out.println("Before Swapping : N1 = " + n1 +" N2 = " +n2);
		
		n1 = n1^n2;
		n2 = n1^n2;
		n1 = n1^n2;
		
		System.out.println("After Swapping : N1 = " + n1 +" N2 = " +n2);
	}

}
