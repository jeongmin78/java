package card;

public class CardCompany {

	private static CardCompany cardCompany = new CardCompany();
	//���������� �ڱ� �ڽ��� Ÿ���� ���� ���� �ν��Ͻ� ����
	//�ܺο��� ������ ���� ���ؼ� public�� �޼��� �ʿ�.
	
	private CardCompany() {	} //�����Ϸ��� �����ڸ� ���������� ���� ��.
	
	public static CardCompany getInstance() { 
		//static�� �ƴϾ ������ ������ ������ �ܺο��� ������ ���� ���ؼ��� static�̾�� ��

		if (cardCompany == null) {
			cardCompany = new CardCompany();
		}
		return cardCompany;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
