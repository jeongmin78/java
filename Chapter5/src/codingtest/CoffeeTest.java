package codingtest;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		
		StarCoffee starcoffee = new StarCoffee();
		BeanCoffee beancoffee = new BeanCoffee();
		
		kim.buyBeanCoffee(beancoffee, Menu.BEANLATTE);
		Lee.buyStarCoffee(starcoffee, Menu.STARLATTE);
		
		kim.showInfo();
		Lee.showInfo();
	}

}
