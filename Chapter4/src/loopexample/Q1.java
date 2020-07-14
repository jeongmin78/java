package loopexample;

public class Q1 {

	public static void main(String[] args) {

		char operator = '*';
		int num1 = 10;
		int num2 = 20;
		
		if (operator == '+') {
			System.out.println(num1+num2);
		}
		else if(operator == '-'){
			System.out.println(num1-num2);
		}
		else if(operator == '*'){
			System.out.println(num1*num2);
		}
		else if(operator == '/'){
			System.out.println(num1/num2);
		}
		else {
			System.out.println("Error");
		}
			
	}

}
