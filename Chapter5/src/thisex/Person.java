package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() { 
		//�����ڴ� �ν��Ͻ� ������ �ʱ�ȭ�ϴµ� �ν��Ͻ� ������ �� ���� �ʾҴµ�  �� ���� � ������Ʈ��Ʈ�� �ö󰡴°� ������� ����
		//age = 100; //�̷��� �ȵ� this���� ��͵� �� �� ����
		this("�̸�����", 1); //�Ⱦ��� null�� �ʱ�ȭ
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() { //�ڽ��� �ּҰ� ��ȯ
		return this;
	}
}
