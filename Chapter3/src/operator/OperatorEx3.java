package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int score = 100;
		
		System.out.println(++score); //문장이 끝나기 전에 연산 결과 적용
		System.out.println(score++); //문장이 끝난 후 연산 결과 적용
		System.out.println(score);
		System.out.println(--score);
		System.out.println(score--);
		System.out.println(score);
	
		int num1 = -10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i=i+2)<10); // or일 경우 앞에가 true이면 뒤에 결과가 반영되지 않는다
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2 > num3)?num2:num3;
		System.out.println(max);
	}

}
