package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		//Company company = new Company(); //private라 사용 불가능
		Company company1 = Company.getInstance(); //싱글톤 패턴
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		//두 값은 동일한 어드레스를 가지고 있다.
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
	}

}
