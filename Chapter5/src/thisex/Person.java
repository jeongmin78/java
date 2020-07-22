package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() { 
		//생성자는 인스턴스 생성을 초기화하는데 인스턴스 생성이 다 되지 않았는데  그 전에 어떤 스테이트먼트가 올라가는걸 허용하지 않음
		//age = 100; //이런거 안됨 this위에 어떤것도 올 수 없음
		this("이름없음", 1); //안쓰면 null로 초기화
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() { //자신의 주소값 반환
		return this;
	}
}
