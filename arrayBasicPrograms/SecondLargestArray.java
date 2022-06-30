package arrayBasicPrograms;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {

		int arr[] = {5,6,8,2,7};
		int size = arr.length;
		
		System.out.println("The Array Before Sorting : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		Arrays.sort(arr);
		
		System.out.println("\n\nThe Array After Sorting : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\n\nThe Scecond Largest Number in the Array is : "+ arr[size - 2]);

	}

}
