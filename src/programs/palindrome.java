

/*3. Check for Palindrome:
  Determine if a given string is a palindrome (reads the same backward as forward).
*/
package programs;

public class palindrome {

	public static void main(String[] args) {
		String palinCheck = "jAMEj";
		
		char check[] = palinCheck.toCharArray();
		String rev = "";
		
		for(int i=check.length-1;i>=0;i--) {
			rev = rev + check[i];
		}
		System.out.println(rev);
		
		if(palinCheck.equalsIgnoreCase(rev)) {
			System.out.println("Given String is Palindrome");
		}else
		{
			System.out.println("Given String is not Palindrome");
		}

	}

}
