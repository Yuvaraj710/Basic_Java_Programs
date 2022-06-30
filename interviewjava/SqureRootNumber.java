package interviewjava;

public class SqureRootNumber {

	public static void main(String[] args) {
		
		int num = 36;
		double temp, sqrt = num/2;
		
		do {
			temp = sqrt;
			sqrt = (temp + (num/temp)) / 2;
		} while((temp-sqrt) != 0);
		
		System.out.println("The Squre Root Of "+num+" is : "+sqrt);
	}
}
