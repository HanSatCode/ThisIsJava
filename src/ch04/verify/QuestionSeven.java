package ch04.verify;

import java.util.Scanner;

public class QuestionSeven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String select = "";
		int account = 0;
		do {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			select = scanner.nextLine();
			
			switch(select) {
				case "1" -> {
					System.out.print("예금액> ");
					String money = scanner.nextLine();
					account += Integer.parseInt(money);
				}
				case "2" -> {
					System.out.print("출금액> ");
					String money = scanner.nextLine();
					account -= Integer.parseInt(money);
				}
				case "3" -> {
					System.out.println("잔고> " + account);
				}
				default -> {
					System.out.println();
					System.out.println("프로그램 종료");
				}
			}
			System.out.println();
		} while(!select.equals("4"));
	}
}
