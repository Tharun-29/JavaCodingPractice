package programs;

import java.util.Arrays;

//2. Find the Largest Element in an Array:
//Find and print the largest element in an array.

public class largHighElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {102, 23412, 12321232, 234321};
		int n = array.length;
		//largest(array,n);
		int output = largest(array,n);
		System.out.println(output);

	}

	/*
	 * public static int largest(int[] a) { int max = a[0]; for(int
	 * i=1;i<a.length;i++) { if(a[i]>max) { max = a[i]; } }
	 * 
	 * return max;
	 * 
	 * 
	 * }
	 */
	//using Built in library methods
	public static int largest(int[] a, int n) {
		Arrays.sort(a);
		return a[n-1];
	}
	

}
