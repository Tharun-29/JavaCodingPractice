package programs;

public class palindromeRecuriveMethod {

	public static void main(String[] args) {
		//  Write a recursive function to check if a string is a palindrome.
		// /*Java Program to Check whether a String is a Palindrome or not using Recursive Function*/
		
		String input = "davad";
		String temp = input.toLowerCase();
		if(isPalindrome(temp)) {
			System.out.println("Input String is Palindrome "+temp);
		}else {
			System.out.println("Input String is not Palindrome ");
		}

	}
	
	//Recursive function that checks 
    //whether the string is palindrome or not
	public static boolean isPalindrome(String input) {
		
		//If string has 0 or 1 character
		if(input.length()==0 || input.length()==1) {
			return true;
		}
		//If string has multiple characters
        //Check whether first and last characters are same or not
		if(input.charAt(0) == input.charAt(input.length()-1)) {
			return isPalindrome(input.substring(1,input.length()-1));
		}
		return false;
		
	}
	
}
