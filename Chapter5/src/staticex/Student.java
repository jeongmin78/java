package staticex;

public class Student {
	//계속 증가되는 값, 외부에서 간섭하지 못하도록 private를 사용하는 것이 좋다.
	//getter, setter 이용
	private static int serialNum = 1000; 

	private int studentID; //외부에서 가져갈 수 없음
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
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() { //변하면 안되기 때문에 set은 제공하지 않음
		return studentID;
	}

	public static int getSerialNum() {
		//static 메서드 안에서는 인스턴스 변수를 사용할 수 없다. static이 아니면 상관없음
		//static 메서드는 인스턴스를 생성하지 않아도 사용이 가능하기 때문에
		//인스턴스 변수는 new가 되어야 생성되므로 사용 불가
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
