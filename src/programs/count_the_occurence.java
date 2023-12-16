package programs;

import java.util.HashMap;

public class count_the_occurence {

	public static void count_the_chara(String givenString) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] stringtochar = givenString.toCharArray();
		for(char c: stringtochar) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		count_the_chara("World is changing");

	}

}
