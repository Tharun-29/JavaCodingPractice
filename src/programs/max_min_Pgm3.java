package programs;

public class max_min_Pgm3 {

	public static void main(String[] args) {
		int numbers[] = { 10, 2, 35, 1, 93, 100, 52, 12 };
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
