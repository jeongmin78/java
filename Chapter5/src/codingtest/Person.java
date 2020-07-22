package codingtest;

public class Person {

	String personName;
	int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee starcoffee, int money) {
		String message = starcoffee.choice(money);
		if (message != null) {
			this.money -= money;
			System.out.println(personName + "¥‘¿Ã " + money + "ø¯¿∏∑Œ "+  message);
		}
	}
	public void buyBeanCoffee(BeanCoffee beancoffee, int money) {
		String message = beancoffee.choice(money);
		if (message != null) {
			this.money -= money;
			System.out.println(personName + "¥‘¿Ã " + money + "ø¯¿∏∑Œ "+ message);
		}
	}
	public void showInfo() {
		System.out.println(personName + "¥‘¿« ¿‹æ◊¿∫ "+ this.money + "¿‘¥œ¥Ÿ.");
	}
}
