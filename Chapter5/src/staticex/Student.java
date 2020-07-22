package staticex;

public class Student {
	//��� �����Ǵ� ��, �ܺο��� �������� ���ϵ��� private�� ����ϴ� ���� ����.
	//getter, setter �̿�
	private static int serialNum = 1000; 

	private int studentID; //�ܺο��� ������ �� ����
	public String studentName;
	public String address;

	public Student(String name) { 
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) { 
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() { //���ϸ� �ȵǱ� ������ set�� �������� ����
		return studentID;
	}

	public static int getSerialNum() {
		//static �޼��� �ȿ����� �ν��Ͻ� ������ ����� �� ����. static�� �ƴϸ� �������
		//static �޼���� �ν��Ͻ��� �������� �ʾƵ� ����� �����ϱ� ������
		//�ν��Ͻ� ������ new�� �Ǿ�� �����ǹǷ� ��� �Ұ�
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
