package codingtest;

public class BeanCoffee {
	int money;
	
	public String choice(int money) {
		this.money += money;
		if (money == Menu.BEANAMERICANO) {
			return "��ٹ� �Ƹ޸�ī�븦 �����Ͽ����ϴ�.";
		}
		else if (money == Menu.BEANLATTE) {
			return "��ٹ� �󶼸� �����Ͽ����ϴ�.";
		}
		else {
			return null;
		}
	}
}
