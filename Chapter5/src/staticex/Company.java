package staticex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {	} //�ܺο� ���µǴ� �����ڰ� �ƴ�

	public static Company getInstance() { //�ܺο��� ������ �� �� �ֵ��� �ϱ� ���ؼ� static�� �ʿ�
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
