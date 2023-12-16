package programs;

import java.util.HashSet;

public class containsDuplicate1 {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,671,21,41,23,671};
		containsDuplicate1 dup = new containsDuplicate1();
		Boolean results = dup.containDup(num);
		System.out.println(results);
	}
 
 public boolean containDup(int num[])
 {
	 HashSet<Integer> number = new HashSet<>();
	 for(int i=0;i<num.length;i++) {
		 if(number.contains(num[i])){
			 return true;
		 }
		 number.add(num[i]);
	 }
	 return false;
 }
 
}