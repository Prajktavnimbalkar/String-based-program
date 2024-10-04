package Stringbasedprograms;
import java.util.Scanner;

public class SwapTwoStrings {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String 1 : ");
		String str1 = scanner.nextLine().trim();
		System.out.println("Enter the String 2 : ");
		String str2 = scanner.nextLine().trim();
		
		str1 = str1 + str2;
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After swapping ::");
		System.out.println("String 1 is : "+str1);
		System.out.println("String 2 is : "+str2);
		scanner.close();
	}

}
