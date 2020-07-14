package classpart;

/* 자바 파일 안에 public 형태의 class는 하나만 존재할 수 있고(그냥 클래스는 존재 가능)
 * public 클래스명은 파일명과 동일해야한다 */
public class Student {

	private int studentID; //private: 이 클래스 내부에서만 사용가능, 외부에서는 사용 불가
	public String studentName;
	public String address;
	
	/* 생성자 오버로딩
	 * 생성자를 두 개 이상 구현하는 경우
	 * 사용하는 코드에서 여러 생성자 중 선택하여 사용할 수 있음
	 * private 변수도 생성자를 이용항 초기화 할 수 있음 */	
	
	public Student(String name) { //생성자1
		studentName = name;
	}
	
	//생성자가 하나라도 있으면 컴파일러는 디폴트 생성자를 제공하지 않음 -> StudentTest의 new Student()에 오류
	//방법1디폴트 생성자를 개발자가 직접 구현
	public Student(int id, String name) { //생성자2
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	//public static void main(String[] agrs) {
		//메인은 클래스의 메서드가 아님(혼동x!)
	//}
}
