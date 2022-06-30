package arrayBasicPrograms;

public class BubbleSortArray {

	public static void main(String[] args) {
		
		int arr[] = {2,8,6,7,3};
		int temp = 0;
		int n = arr.length;
		
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<n; j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("The sorted array is : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
	}

}
