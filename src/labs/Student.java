package labs;

public class Student {
	private String name;
	private String phone;
	private String city;
	private String state;
	private String SSN;
	private String email;
	private static int iD = 1000;
	private String userId;
	private String courses="";
	private static final int costOfCourse = 800;
	private int balance=0;
	
	
	public Student (String name, String SSN) {
		iD ++;
		this.name = name;
		this.SSN = SSN;
		System.out.println("Student Created");
		genUserId();
		genEmail();
		
		
	}
	
	public void enroll (String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourse;
		
	}
	
	public void pay(int amount) {
		System.out.println("Payment recieved!");
		balance = balance - amount;
		System.out.print("New ");checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Balance is: $" + balance);
	}
	
	public void showCources() {
		System.out.println(courses);
	}
	
	private void genEmail () {
		email = name.toLowerCase() + "@testemail.com";
		System.out.println("Email ID is: "+ email);
	}

	private void genUserId () {
	
		int randNum = (int) (Math.random() * 1000);
		userId = iD + "" + randNum + "" + SSN.substring(4, 9);
		System.out.println("Student ID: " + userId);
	}
	
	public String getUserId() {
		return userId;
	}

	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
		

	public String getName() {
		return name;
	}


	public String getSSN() {
		return SSN;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", Sity=" + city + ", State=" + state + ", SSN=" + SSN
				+ ", email=" + email + ", userId=" + userId + ", Current Balance= $"+ balance +"]";
	}
	

}
