package arrayBasicPrograms;

public class LargestElementArray {

	public static void main(String[] args) {
		
		int arr[] = {3,5,8,6,9};
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("The Largest Value in the Array is : "+ max);

	}

}
