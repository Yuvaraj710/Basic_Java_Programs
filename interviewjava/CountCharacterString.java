package interviewjava;

public class CountCharacterString {

	public static void main(String[] args) {
		
		String s = "i am learning Java";
		int count = 0;
		
		for (int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) !=  ' ')
			{
				count++;
			}
		}
		
		System.out.println("The Character in the String is : "+ count);


	}

}
