package codingtest;

public class StarCoffee {

	int money;
	
	public String choice(int money) {
		this.money += money;
		if (money == Menu.STARAMERICANO) {
			return "���ٹ� �Ƹ޸�ī�븦 �����Ͽ����ϴ�.";
		}
		else if (money == Menu.STARLATTE) {
			return "���ٹ� �󶼸� �����Ͽ����ϴ�.";
		}
		else {
			return null;
		}
	}
}
