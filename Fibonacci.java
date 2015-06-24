// Fibonacci with recursion

package recursion;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 3;
		for(int i=1; i<=n; i++)
			System.out.print(calulateFib(i) + " ");
	}
	private static int calulateFib(int n) {
		if(n==1 || n==2)
			return 1;
		else
			return calulateFib(n-1) + calulateFib(n-2);
			
	}
}
