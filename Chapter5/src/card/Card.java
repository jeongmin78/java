package card;

public class Card {

	private static int serialNum = 1000;
	private int cardNumber;
	
	Card() { //���� Ŭ���������� ��밡�������� �ܺο����� ��� �Ұ�
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
