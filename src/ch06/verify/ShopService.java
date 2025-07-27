package ch06.verify;

public class ShopService {		// 18번 문제
	
	private static ShopService shopService = new ShopService();
	
	public static ShopService getInstance() {
		return shopService;
	}
}
