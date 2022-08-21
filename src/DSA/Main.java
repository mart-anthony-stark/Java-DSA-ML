package DSA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Array<Integer> arr = new Array<Integer>(20);
		
		Scanner scanner = new Scanner(System.in);
		

		while(true) {
			System.out.print("Enter number: ");
			int n = scanner.nextInt();
			
			if(n == -1) break;
			
			arr.add(n);
		}
		
		for(int i=0;i<arr.getSize();i++) {
			System.out.println(arr.get(i));
		}
		
		scanner.close();
	}
}
