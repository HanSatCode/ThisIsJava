package ch05.verify;

import java.util.Scanner;

public class QuestionNine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String select = "";
		
		int num = 0;
		int[] scores = null;
		
		do {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택 > ");
			select = scanner.nextLine();
			
			switch(select) {
				case "1" -> {
					System.out.print("학생 수 > ");
					num = Integer.parseInt(scanner.nextLine());
					scores = new int[num];
				}
				case "2" -> {
					for(int i = 0; i < num; i++) {
						System.out.print("scores[" + i + "] > ");
						scores[i] = Integer.parseInt(scanner.nextLine());
					}
				}
				case "3" -> {
					for(int i = 0; i < num; i++) {
						System.out.println("scores[" + i + "] : " + scores[i]);
					}
				}
				case "4" -> {
					int max = scores[0];
					int sum = scores[0];
					for(int i = 1; i < num; i++) {
						if (max < scores[i]) max = scores[i];
						sum += scores[i];
					}
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + (double) sum / num);
				}
				case "5" -> {
					System.out.println("프로그램 종료");
				}
			};
		} while (!select.equals("5"));
	}
}
