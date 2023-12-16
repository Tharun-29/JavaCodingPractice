/*
  reverse a string program without using StringBuffer/StringBuilder.

Steps:
📍 First, we need to convert a string into character array using toCharArray() method.
📍 Next, by iterating from last character to first char we can reverse the string. 
For this, we will use length method. As we know, string index starts from 0, 
hence we need to iterate from charArray.length-1;
 */


/*1. Reverse a String:
  Write a Java program to reverse a given string.*/
package programs;

import java.util.Scanner;

public class Reverse_String {

	public static void reverse_char() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input_char = sc.next();
		String rev_char ="";
		char[] givenStrCharArray = input_char.toCharArray();
		
		for(int i=givenStrCharArray.length-1;i>=0;i--) {
			rev_char = rev_char + givenStrCharArray[i];
		}
		System.out.println(rev_char);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			reverse_char();
	}

}
