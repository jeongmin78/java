package reference;

public class Student {

	int studentID;
	String studentName;
	//���⿡ ���� ���� ������ ���°� db����ȭ �κп����� ���� ������ �ƴ�

	Subject korea;
	Subject math;
	
	public Student(int id, String name) { //�����ڿ��� �ʱ�ȭ�� �ϰ� ����
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
	}
}
