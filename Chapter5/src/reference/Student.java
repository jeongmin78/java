package reference;

public class Student {

	int studentID;
	String studentName;
	//여기에 과목에 대한 내용이 들어가는건 db정규화 부분에서도 좋은 구조가 아님

	Subject korea;
	Subject math;
	
	public Student(int id, String name) { //생성자에서 초기화를 하고 쓰기
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
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
