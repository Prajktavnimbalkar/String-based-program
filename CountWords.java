package Stringbasedprograms;
import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scanner.nextLine().trim();
		if(str.length() == 0){
			System.out.println("Number of wrods : 0");
			System.exit(0);
		}
		System.out.println("Number of words : "+countWords(str));
		scanner.close();
	}
	
	private static int countWords(String str){
		int count = 1;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			System.out.println(ch);
			if(ch == ' ' || ch == '\t' || ch == '\n'){
				count++;
				ch = str.charAt(i+1);
				while(ch == ' ' || ch == '\t' || ch == '\n'){
					i++;
					ch = str.charAt(i+1);
					//this while loop removes continuous white spaces
				}
			}
		}
		return count;
	}
}
