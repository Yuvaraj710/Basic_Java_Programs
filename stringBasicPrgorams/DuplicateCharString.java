package stringBasicPrgorams;

public class DuplicateCharString {

	public static void main(String[] args) {
		
		String str = "go to gym t";
		int count;
		int n = str.length();
		
		char arr[] = str.toCharArray();
		
		System.out.println("Duplicate Character in the String : ");
		
		for(int i=0; i<n; i++)
		{
			count = 1;
			for(int j=i+1; j<n; j++)
			{
				if(arr[i] == arr[j] && arr[i] != ' ')
				{
					count++;
					arr[j] = '0';
				}
			}
			if(count > 1 && arr[i] != '0')
			{
				System.out.print(arr[i]+ " ");
			}
		}
		
		
	}
	
	
	
}
