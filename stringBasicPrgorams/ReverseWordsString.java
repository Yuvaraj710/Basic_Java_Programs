package stringBasicPrgorams;

public class ReverseWordsString {

	public static void main(String[] args) {

		String s = "I want to switch back";
		
		String[] words = s.split(" ");
		
		String output = "";
		
		
		for (int i=0; i<words.length; i++)
		{
			String revWords = "";
			for(int j=words[i].length()-1; j>=0; j--)
			{
				revWords = revWords + words[i].charAt(j);
			}
			
			output = output + revWords + " " ;
					
		}
		
		System.out.println("The Reversed word String is :"+ output);
		

	}

}
