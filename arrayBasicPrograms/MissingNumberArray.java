package arrayBasicPrograms;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5,6};
		
		int sum =0;
		int n = arr.length;
		int total;
		
		System.out.println("The Length of the Array Is : "+ n);
		
		total = (n+1)*(n+2) / 2; 
		System.out.println("The total sum of the Array is : "+ total);
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		int missingnumber = total - sum ;
		
		System.out.println("The Missing Number is : "+ missingnumber);
		
		
		
		

	}

}
