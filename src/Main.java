import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = in.nextInt();
		
		for(int q=1;q<=10;q++) {
			for(int i=rows; i > 0; i--) {
				for(int j=0; j < i; j++) {
					System.out.print("* ");
				}
				for(int m=1; m<=3;m++) {
					System.out.print("          ");
					for(int j=0; j <= i; j++) {
						System.out.print("* ");
					}
				}
				System.out.println();
			}
		}
		in.close();
	}
}
