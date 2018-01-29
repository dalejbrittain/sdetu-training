package oop;

public class BankAccount implements IRate {
	// static >> belongs to the class NOT the object instance
	// final >> constant (often static and final used together)
	private static final String routingNumber = "123456789";
	
	// Define variables
	private String accountNumber;
	private String name;
	private String ssn;
	private String accountType;
	private double balance = 0;
	
	// Constructor definitions: unique methods
		//1. They are used to define / setup / initialize properties of an object
		//2. Constructors are IMPLICITLY called upon instantiation
		//3. The same name as the class itself
		//4. Constructors have NO return type
	BankAccount(){
		
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType){
		
		System.out.println("NEW ACCOUNT CREATED");
		System.out.println("ACCOUNT TYPE: " + accountType);
		
	}
	BankAccount(String accountType, double initDeposit){
		
		System.out.println("NEW ACCOUNT CREATED");
		System.out.println("ACCOUNT TYPE: " + accountType);
		System.out.println("INITIAL DEPOSIT of: $" + initDeposit);
		String Msg = null;
			if (initDeposit < 1000) {
				Msg = "ERROR: Minimun deposit must be at least $1,000";
			}
			else {
				Msg = "Thank you for your deposit of: $" + initDeposit;
			}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	// Setters and Getters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	// Interface
	public void setRate() {
		System.out.println("SETTING RATE");
		
		
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECNET TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance); 
	}
	
	public void checkBalance() {
		
		System.out.println("Current balance is: $" + balance);
		
	}
	
	public void getStatus() {
		
	}
	
	
	@Override
	public String toString() {
		return "[Name: " + name + " / " +"Routing#: " + routingNumber + " / " + "Acc#: "+ accountNumber + " / BALANCE: $" + balance + " }";
	}



}
