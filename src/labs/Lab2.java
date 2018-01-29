package labs;

public class Lab2 {

	public static void main(String[] args) {
		
		
		Student stu1 = new Student ("Dale", "077603382");
		stu1.setPhone("720-939-8899");
		stu1.setCity("Arvada");
		stu1.setState("CO");
		stu1.enroll("Math101");
		stu1.enroll("Eng101");
		stu1.enroll("CIS101");
		
		stu1.showCources();
		stu1.checkBalance();
		stu1.pay(800);
		
		System.out.println(stu1.toString());

	}

}
