package stringBasicPrgorams;

public class VowelsConstString {

	public static void main(String[] args) {
		
		String str= "Today We Will Learn Simple Java";
		int vCount = 0, cCount = 0;
		
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
			   str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
			   str.charAt(i) == 'u')
			{
				vCount++;
			}
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				cCount++;
			}		
		}
		
		System.out.println("Total Vowels in the String : " + vCount);
		System.out.println("\nTotal Const in the String : "+ cCount);

	}

}
