package programs;

public class string_Pgm1 {
	
	/* Write a prgm to print 
	 * J
	 * Ja
	 * Jav
	 * Java
	 */

	public static void main(String[] args) {
		String s = "Java";
        String temp = "";
        for(int i=0;i<s.length();i++) {
        	temp = temp + s.charAt(i);
        	System.out.println(temp);
        }
}
}
