package codingtest;

public class BeanCoffee {
	int money;
	
	public String choice(int money) {
		this.money += money;
		if (money == Menu.BEANAMERICANO) {
			return "콩다방 아메리카노를 구입하였습니다.";
		}
		else if (money == Menu.BEANLATTE) {
			return "콩다방 라떼를 구입하였습니다.";
		}
		else {
			return null;
		}
	}
}
