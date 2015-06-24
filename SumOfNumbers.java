package recursion;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
//		System.out.println("Enter how many numbers? ");
//		Scanner input = new Scanner(System.in);
//		int no = input.nextInt();
		int[] list = {1,2,3};
		int total = calculateSum(list,list.length-1);
		System.out.println(total);
	}

	private static int calculateSum(int[] list, int n) {
		if(n == 0)
			return list[n];
		else
			return list[n] + calculateSum(list,n-1);
	}
}
