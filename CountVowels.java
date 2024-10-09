package Stringbasedprograms;

public class CountVowels {
	public static void main(String[] args) {

		String line = "prajkta";
		int count = 0;
		
		System.out.println("Given String is :"+line);
		line = line.toLowerCase();
		for(char ch : line.toCharArray()){
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
				break;
			}
		}
		System.out.println("Number of Vowels are :"+count);
	}
}
