package programs;

public class reverseNumber {

	public static void main(String[] args) {
		// Try using String buffer
		int num = 214;
		int rev = 0;
	    while(num!=0){
	    	num = num%10;
	    	rev = rev + num;
	    	num = num/10;
	    }
	    System.out.println(rev);
	}

}
