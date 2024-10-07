package Stringbasedprograms;
import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String str = scanner.nextLine();
		String reversedString = reverseString(str);
		System.out.println("Reversed String is :: "+reversedString);
		scanner.close();
	}
	
	public static String reverseString(String str){
		char[] charArray = str.toCharArray();
		int j = charArray.length-1;
		for(int i=0 ;i < charArray.length/2; i++, j--){
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		return new String(charArray);
	}
}
