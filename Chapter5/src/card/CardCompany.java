package card;

public class CardCompany {

	private static CardCompany cardCompany = new CardCompany();
	//내부적으로 자기 자신의 타입을 가진 변수 인스턴스 생성
	//외부에서 가져다 쓰기 위해선 public한 메서드 필요.
	
	private CardCompany() {	} //컴파일러가 생성자를 제공해주지 않을 것.
	
	public static CardCompany getInstance() { 
		//static이 아니어도 문법상 문제는 없지만 외부에서 가져다 쓰기 위해서는 static이어야 함

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
