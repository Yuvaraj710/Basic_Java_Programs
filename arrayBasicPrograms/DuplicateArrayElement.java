package arrayBasicPrograms;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		
		int arr[] = {3,5,8,3,6,5,3,9};
		
		System.out.println("The Duplicate Elements in the Array : ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+ " " );
				}
				
			}
		}
	}
}
