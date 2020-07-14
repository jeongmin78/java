package loopexample;

public class Q2 {

	public static void main(String[] args) {

		int column = 5;
		int row = column;
		for(int i=0; i<column; i++) {
			for(int j=row; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<column; i++) {
			for(int k=0; k<i+2; k++) {
				System.out.print(" ");
			}
			for(int j=row; j>i*2; j--) {
				System.out.print("*");
			}
		
			System.out.println();
		}
		
	}

}