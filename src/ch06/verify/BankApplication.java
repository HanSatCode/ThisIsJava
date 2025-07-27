package ch06.verify;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Account[] acc = new Account[100];
		int accNum = 0;
		String select;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > "); select = scanner.nextLine();
			
			switch(select) {
				case "1" -> {
					System.out.print("계좌번호: "); String num = scanner.nextLine();
					System.out.print("계좌주: "); String name = scanner.nextLine();
					System.out.print("초기입금액: "); int balance = Integer.parseInt(scanner.nextLine());
					
					boolean checkNum = false;
					for(int i = 0; i < accNum; i++) {
						if (acc[i].getInfo()[0].equals(num)) {
							checkNum = true;
							System.out.println("결과: 이미 계좌번호가 존재합니다. 다른 번호를 사용하세요.");
							break;
						}
					}
					if (!checkNum) {
						acc[accNum] = new Account(num, name, balance); accNum++;
						System.out.println("결과: 계좌가 생성되었습니다.");
					}
				}
				case "2" -> {
					System.out.println("----------\n계좌목록\n----------");
					for(int i = 0; i < accNum; i++) {
						String[] temp = acc[i].getInfo();
						System.out.println(temp[0] + "\t" + temp[1] + "\t" + temp[2]);
					}
				}
				case "3" -> {
					System.out.println("----------\n예금\n----------");
					System.out.print("계좌번호: "); String num = scanner.nextLine();
					System.out.print("예금액: "); int deposit = Integer.parseInt(scanner.nextLine());
					
					boolean checkNum = false;
					for(int i = 0; i < accNum; i++) {
						if (acc[i].getInfo()[0].equals(num)) {
							checkNum = true;
							String[] temp = acc[i].getInfo();
							acc[i].setInfo(temp[0], temp[1], Integer.parseInt(temp[2]) + deposit);
							System.out.println("결과: 입금이 완료되었습니다.");
							break;
						}
					}
					if (!checkNum) {
						System.out.println("결과: 입금 실패하였습니다.");
					}
				}
				case "4" -> {
					System.out.println("----------\n출금\n----------");
					System.out.print("계좌번호: "); String num = scanner.nextLine();
					System.out.print("예금액: "); int withdraw = Integer.parseInt(scanner.nextLine());
					
					boolean checkNum = false;
					for(int i = 0; i < accNum; i++) {
						if (acc[i].getInfo()[0].equals(num)) {
							checkNum = true;
							String[] temp = acc[i].getInfo();
							int result = Integer.parseInt(temp[2]) - withdraw;
							
							if (result < 0) {
								System.out.println("결과: 잔고가 부족합니다.");
								break;
							}
							acc[i].setInfo(temp[0], temp[1], result);
							System.out.println("결과: 출금이 완료되었습니다.");
							break;
						}
					}
					if (!checkNum) {
						System.out.println("결과: 출금 실패하였습니다.");
					}
				}
				case "5" -> {
					System.out.println("프로그램 종료");
					return;
				}
				
			}
		} while (select != "5");
	}
}
