package hello;

public class ImplicitConversion {
	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum; //묵시적 형변환 일어남
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
	
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println(dNum);
	}

}
