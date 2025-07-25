package ch05.verify;

public class QuestionSeven {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int M = array[0];
		for(int i = 1; i < array.length; i++) {
			if (M < array[i]) M = array[i];
		}
		System.out.println("가장 큰 정수 = " + M);
	}
}
