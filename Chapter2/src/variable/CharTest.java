package variable;

public class CharTest {
	/*문자 자료형 
	 *문자를 변수에 저장하면 문자에 해당하는 코드 값이 저장됨*/
	
	public static void main(String[] args) {
	
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		char hangul = '\uAC00';
		System.out.println(hangul); //ctrl+space: 쓸수있는 문법?나옴
		
		char ch2 = '한';
		System.out.println(ch2);
		
	}
}
