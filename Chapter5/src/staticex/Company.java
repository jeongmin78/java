package staticex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {	} //외부에 오픈되는 생성자가 아님

	public static Company getInstance() { //외부에서 가져다 쓸 수 있도록 하기 위해서 static이 필요
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
