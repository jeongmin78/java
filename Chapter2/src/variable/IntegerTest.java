package variable;

public class IntegerTest {

	public static void main(String[] args) {
		byte bs = -128; //-128~127까지 표현 가능, -129는 표현할 수 있는 범위를 벗어남
		System.out.println(bs);
		
		//int iVal = 12345678900; //표현 범위 벗어남
		long lVal = 12345678900L; //L : 4바이트로 처리하기 크니까 이 숫자는 8바이트로 처리하라는 의미 , 4바이트 이하는 필요없음
		System.out.println(lVal);
	}
}
