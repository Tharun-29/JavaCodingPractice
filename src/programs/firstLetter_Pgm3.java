package programs;

//Java program to Print first letter of each word present in string.

public class firstLetter_Pgm3 {

	public static void main(String[] args) {
		String s = "I am a Automation Engineer";
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			// Logic to implement first character of each word in a String
			if(c[i] != ' ' &&(i == 0 || c[i-1]==' ')){
				System.out.println(c[i]);
			}
		}

	}

}
