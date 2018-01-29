package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create a new bank account >> Think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		// Should not allow client to set values of variables directly 
		/*acc1.name = "Dale J. Brittain";
		acc1.accountNumber = "999-999-999";
		acc1.balance = 14000;*/
		acc1.setName("Dale J. Brittain");
		System.out.println(acc1.getName());
		acc1.deposit(100);
		acc1.deposit(100);
		acc1.deposit(100);
		acc1.deposit(100);
		acc1.withdraw(50);
		
		// Polymorphism  through overriding
		System.out.println(acc1.toString());
		
		System.out.println("***************************************");
		System.out.println("");

		// Polymorphism through overloading
		new BankAccount("CHECKING");
		
		System.out.println("***************************************");
		System.out.println("");
		
		new BankAccount("CHECKING", 420.59);
		
		

	}

}
