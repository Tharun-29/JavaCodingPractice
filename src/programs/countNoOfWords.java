package programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class countNoOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s[] = str.split(" ");
		int counts = s.length;
		System.out.println(counts);
		
		//
		StringTokenizer st = new StringTokenizer(str);
		 int result2 = st.countTokens();
		 System.out.println(result2);

	}

}
