package classpart;

/* �ڹ� ���� �ȿ� public ������ class�� �ϳ��� ������ �� �ְ�(�׳� Ŭ������ ���� ����)
 * public Ŭ�������� ���ϸ�� �����ؾ��Ѵ� */
public class Student {

	private int studentID; //private: �� Ŭ���� ���ο����� ��밡��, �ܺο����� ��� �Ұ�
	public String studentName;
	public String address;
	
	/* ������ �����ε�
	 * �����ڸ� �� �� �̻� �����ϴ� ���
	 * ����ϴ� �ڵ忡�� ���� ������ �� �����Ͽ� ����� �� ����
	 * private ������ �����ڸ� �̿��� �ʱ�ȭ �� �� ���� */	
	
	public Student(String name) { //������1
		studentName = name;
	}
	
	//�����ڰ� �ϳ��� ������ �����Ϸ��� ����Ʈ �����ڸ� �������� ���� -> StudentTest�� new Student()�� ����
	//���1����Ʈ �����ڸ� �����ڰ� ���� ����
	public Student(int id, String name) { //������2
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	//public static void main(String[] agrs) {
		//������ Ŭ������ �޼��尡 �ƴ�(ȥ��x!)
	//}
}
