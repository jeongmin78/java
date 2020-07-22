package card;

public class Card {

	private static int serialNum = 1000;
	private int cardNumber;
	
	Card() { //같은 클래스에서는 사용가능하지만 외부에서는 사용 불가
		serialNum++;
		cardNumber = serialNum;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}
