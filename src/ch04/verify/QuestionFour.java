package ch04.verify;

public class QuestionFour {
	public static void main(String[] args) {
		
		int cnt = 0;
		int dice1 = 0;
		int dice2 = 0;
		while(dice1 + dice2 != 5) {
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			System.out.println(++cnt + "번째 시도 : (" + dice1 + ", " + dice2 + ")");
		}
		System.out.println("프로그램 종료");
	}
}
