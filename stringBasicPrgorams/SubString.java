package stringBasicPrgorams;

public class SubString {
	
	public static void main(String[] args) {
		
		String s = "CAT";
		int n = s.length();
		int temp =0;
		
		String arr[] = new String[n*(n+1)/2];
		
		for(int i=0; i<n; i++)
		{
			for (int j=i; j<n; j++)
			{
				arr[temp] = s.substring(i, j+1);
				temp++;
			}
		}
		
		System.out.println("All the Substring of the String");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ ' ');
		}
	}

}
