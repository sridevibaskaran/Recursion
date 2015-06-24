// Fibonacci with recursion - version 1

package recursion;

public class FibonacciWithoutRecursion {
	static int fib0 = 1;
	static int fib1 = 1;
	public static void main(String[] args) {
		int n = 5;
		System.out.print(fib0 + " " + fib1);
		calculateFibonacci(n);
	}
	
	public static void calculateFibonacci(int n){
		for(int i=3; i<=n; i++){
			int fib2 = fib0 + fib1;
			System.out.print(" " + fib2 + " ");
			fib0 = fib1;
			fib1 = fib2;
		}
	}
}
