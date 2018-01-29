package basics;

public class FivonnaciApp {

	public static void main(String[] args) {
		//Fivonnoci number is defined by the sum of the 2 previous fibonnoci numbers
		
		int i=0;
		do {
		System.out.println(fib(i));
		i++;
		}while (i<13); 
	}
	public static int fib(int n) {
		if ( n == 0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return ( ((fib(n-1)) + (fib(n-2))) );
	}
}
