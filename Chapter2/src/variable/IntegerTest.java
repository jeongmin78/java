package variable;

public class IntegerTest {

	public static void main(String[] args) {
		byte bs = -128; //-128~127���� ǥ�� ����, -129�� ǥ���� �� �ִ� ������ ���
		System.out.println(bs);
		
		//int iVal = 12345678900; //ǥ�� ���� ���
		long lVal = 12345678900L; //L : 4����Ʈ�� ó���ϱ� ũ�ϱ� �� ���ڴ� 8����Ʈ�� ó���϶�� �ǹ� , 4����Ʈ ���ϴ� �ʿ����
		System.out.println(lVal);
	}
}
