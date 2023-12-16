package programs;

public class no_of_Even_Odd {

	public static void main(String[] args) {
		// Java Program to Find number of Even and Odd Integers.
		int num[] = {3241,3452,41,32,6,1,615,624,8,94};
		int count = 0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				count++;
			}
		}
		System.out.println("No of even no: "+count);
		System.out.println("No of odd no: "+(num.length-count));
 
	}

}
