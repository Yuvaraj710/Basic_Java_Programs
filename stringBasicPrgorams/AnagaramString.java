package stringBasicPrgorams;

import java.util.Arrays;

public class AnagaramString {

	public static void main(String[] args) {
		
		String str1 = "Brag";
		String str2 = "Grab";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char string1[] = str1.toCharArray();
		char string2[] = str2.toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		if(str1.length() != str2.length())
		{
			System.out.println("The Given Strings Not an Anagram");
		}
		else if (Arrays.equals(string1, string2))
		{
			System.out.println("The Given Strings is an Anagram");
		}
		
	}

}
