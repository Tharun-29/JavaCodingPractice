package programs;

import java.util.Scanner;

public class extractLastFourCharOfString {

	public static void main(String[] args) {
		//Extract Last 4 characters of any String.
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		extractLastFourChar(input);
		
	}

	public static void extractLastFourChar(String input) {
		
		if(input == null) {
			System.out.print("Input is null");
		}
		
		int len = input.length();
		if(len<=4) {
			System.out.print(input);
		}else {
			System.out.print(input.substring(len-4));
		}
		
	}

}
