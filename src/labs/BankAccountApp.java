package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("077603382", 1000);
		BankAccount acc2 = new BankAccount("420695150", 2000);
		BankAccount acc3 = new BankAccount("187860666", 3000);
		
		acc1.setName("Dale J. Brittain");
		System.out.println(acc1.getName() );
		acc1.makeDeposit(999);
	

	}

}

class BankAccount implements IInterest{
	// Properties of a bank account
	private static int iD = 1000;								// Internal ID
	private String accountNumber; 								// iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "999888777";	// static 
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors
	public BankAccount(String SSN, double initDeposit) {
		this.SSN = SSN;
		iD ++;
		setAccountNumber();
		balance = initDeposit;
		System.out.print("Your starting balance is: $"); 
		showBalance();
		System.out.println("");
	}
	
	//Interface
	@Override
	public void accrue() {
		balance = balance * (1+ rate/100);
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "-" + random + "-" + SSN.substring(0, 2);
		System.out.println("Your Account Number is: " + accountNumber);
			}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void makeDeposit(double amount) {
		System.out.println("Making a deposit");
		balance = balance + amount;
		System.out.print("Your new balance is: $"); showBalance();
	}
	public void payBill(double amount) {
		balance = balance - amount;
	}
	public void showBalance() {
		System.out.print(balance);
	}
}
