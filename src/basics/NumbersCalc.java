package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();

		int numA = 10;
		int numB= 2;
		
		System.out.println("The sum of " + numA + " and " + numB + " is: " + addNumbers(numA,numB));
		multipleNumbers(numA, numB);
		
	}
	
	static void printName() {
		System.out.println("My name is Dale");
	}

	static int addNumbers(int a,int b){
		// This function will add two numbers
		return a + b;
		
	
	}
	
	static void multipleNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		System.out.println("The product of " + valueA + " and "+ valueB +" is: " + product);
		
	}

}
