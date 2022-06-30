package stringBasicPrgorams;

public class DuplicateWordsString {

	public static void main(String[] args) {
		
		String str = "Learn Java Learn Selenium Learn API testing";
		int count;
		str = str.toLowerCase();
		
		String words[] = str.split(" ");
		
		for(int i=0; i<words.length; i++)
		{
			count =1;
			for(int j=i+1; j<words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j] = "0";
				}
			}
			if(count > 1 && words[i] != "0")
			{
				System.out.println(words[i]+ " ");
			}
		}
		

	}

}
