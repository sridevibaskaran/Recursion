package recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		int result = factorial(no);
		System.out.println("Factorial is: " + result);
	}

	private static int factorial(int no) {
		if(no <= 1)
			return 1;
		else
			return no*factorial(no-1);
	}
}
