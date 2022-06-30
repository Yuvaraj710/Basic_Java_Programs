package arrayBasicPrograms;

public class OddEvenNumberArray {

	public static void main(String[] args) {
		
		int[] arr = {5,2,6,3,7,8,9};
		
		System.out.println("The Odd Numbers in the Array : ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println("\n\nThe Even Numbers in the Array : ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
