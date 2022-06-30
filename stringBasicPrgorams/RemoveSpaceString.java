package stringBasicPrgorams;

public class RemoveSpaceString {

	public static void main(String[] args) {
		
		String s1 = "I am Learning Java";
		String s2 = "";
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i) != ' ')
			{
				s2 = s2 + s1.charAt(i);
			}
		}
		
		System.out.println("String With Spaces    : " + s1);
		System.out.println("String Without Spaces : " + s2);

	}

}
