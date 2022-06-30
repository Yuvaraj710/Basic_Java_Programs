package arrayBasicPrograms;

public class SortingArray {

	public static void main(String[] args) {
		
		int arr[] = {3,5,9,6,4,2,7};
		int temp =0;
		
		System.out.println("Array Before Sorting");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("\n\nArray After Sorting");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
