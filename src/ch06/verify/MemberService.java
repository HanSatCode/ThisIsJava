package ch06.verify;

public class MemberService {	// 15번 문제
	String id;
	String password;
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) return true;
		else return false;
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃되었습니다.");
	}
}
