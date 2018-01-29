package labs;

public class lab1 {

	public static void main(String[] args) {
		System.out.print(sum(10));
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println(fac(4));
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		int[] numbers = {10,80,-898,100,-24,42,420,0};
		System.out.println("The min is " + findMin(numbers));
		System.out.println("The max is " + findMax(numbers));
		System.out.println("The average is " + findAve(numbers));
		

	}
	public static int sum (int n) {
		int sum = 0;
		for(int i=1; i<=n; i++ ) {
			System.out.print(sum + " + " + i + " = ");
			sum=sum+i;
			System.out.println(sum);
		}
				return sum;
									}
				
	public static int fac (int n) 
	{
		if ( n == 0) {
			return 1;
		}

		return ( fac(n-1)*n) ;
	}
	public static int findMin (int[]arr) {
		int min = arr[0];
		for(int i=0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
			return min;
		}
	public static int findMax (int[]arr) {
		int max = arr[0];
		for(int i=0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
			return max;
		}
	public static int findAve (int[]arr) {
		int sum = arr[0];
		for(int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
			}
		
			return sum/arr.length;
		}
}


