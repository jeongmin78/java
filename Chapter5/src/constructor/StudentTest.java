package constructor;

public class StudentTest {

	public static void main(String[] agrs) {
		
		//Student studentLee = new Student();//����Ʈ ������
		
		Student studentLee = new Student("�̼���");//������
		//����Ʈ �����ڰ� �ȵǴϱ� �����ڸ� ������ ����Ѵ�
		//studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "������");
		//studentKim.studentName = "������";
		//studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); //�������� ��� : Ŭ������ Ǯ����@������ Heap�ּҰ�
		System.out.println(studentKim);
	}
}
