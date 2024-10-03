package Stringbasedprograms;

public class Palindrome {
	public static void main(String[] args) {
		String word = "malayalam";

		System.out.println("The Given String \""+word+"\"");
		if( checkPalindrome(word) )
			System.out.println("Yes, it is a Palindrome");
		else
			System.out.println("No, it is NOT a Palindrome");
	}
	
	private static boolean checkPalindrome(String str){
		int strLen = str.length();

		for(int i=0; i < str.length()/2; i++)
			if(str.charAt(i) != str.charAt(strLen-i-1))
				return false;
		return true;
	}
}
