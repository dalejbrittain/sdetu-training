package basics;

public class Weather {
	public static void main (String[]args) {
		//This program will give suggestions of what to wear based on the weather (temperature)
		
		int temperature = 70;
		
		if (temperature > 80 ) {
			System.out.println(temperature +" is pleasant. Wear shorts and t-shirt");
		}
		else if (temperature > 60) {
			System.out.println(temperature + " is not very pleasant. Wear long-sleeve shirt and jeans");
		}
		
	}
	

}
