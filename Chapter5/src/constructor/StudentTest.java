package constructor;

public class StudentTest {

	public static void main(String[] agrs) {
		
		//Student studentLee = new Student();//디폴트 생성자
		
		Student studentLee = new Student("이순신");//생성자
		//디폴트 생성자가 안되니까 생성자를 가져다 써야한다
		//studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "김유신");
		//studentKim.studentName = "김유신";
		//studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); //참조변수 출력 : 클래스의 풀네임@가상의 Heap주소값
		System.out.println(studentKim);
	}
}
