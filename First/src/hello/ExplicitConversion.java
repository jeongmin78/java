package hello;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int i =1000;
		byte bNum = (byte)i; //명시적 형변환 : 데이터 유실이 발생할 수 있음		
		System.out.println(bNum);

		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum; //실수부의 소수점 부분이 잘린다 -> 1+0
		int iNum2 = (int)(dNum1 + fNum); //1.2+0.9 결과의 소수점 부분이 잘린다
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}
