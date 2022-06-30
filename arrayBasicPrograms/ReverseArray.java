package arrayBasicPrograms;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = {3,5,8,6,9};
		
		System.out.println("The Array Before Reverse : ");
		
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
        System.out.println("\n\nThe Array After Reverse : ");
		
		for(int i =arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+ " ");
		}
		

	}

}
