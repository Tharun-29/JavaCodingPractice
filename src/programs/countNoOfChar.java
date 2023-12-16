package programs;

import java.util.Scanner;

public class countNoOfChar {

	public static void main(String[] args) {
		// Java program to count number of characters in String including white spaces
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String temp = str.trim();
		char[] charArray = temp.toCharArray();
		System.out.println(charArray.length);

	}

}
