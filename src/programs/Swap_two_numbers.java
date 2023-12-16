package programs;

public class Swap_two_numbers {
   
	// Swap of two numbers without using third variables
	public static void main(String[] args) {
		int a = 5;
		int b = 11;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Swap of a and b:"+" "+a+" "+b);

	}

}
