package oop;
class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat(){
		System.out.println(email + " is eating");
		
	}
	void sleeep(){
		System.out.println(phone + " is sleeping");
	}
	
}

public class demo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name="Dale";
		person1.email="dale@test.com";
		person1.phone="720-939-8899";
		
		person1.walk();
		person1.eat();
		person1.sleeep();
		
		
		
		/*// Person
		
		// Attributes, variables, adjectives, descriptions
		String name = "Dale";
		String email = "dale@test.com";
		String phone = "720-939-8899";
		
		String name2 = "Stacey";
		String email2 = "Stacey@test.com";
		String phone2 = "720-351-1425";
		
		// Actions, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// Actions, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");

	}
	static void walking(String name) {
		System.out.println(name + " is walking");
	*/
	}

}
