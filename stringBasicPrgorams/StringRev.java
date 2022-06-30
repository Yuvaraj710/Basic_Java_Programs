package stringBasicPrgorams;

public class StringRev {

	public static void main(String[] args) {
		
		String str = "Yuvaraj";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("The Reversed String is : "+ rev);
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		System.out.println("\nReverse : " + sb);
	}

}
