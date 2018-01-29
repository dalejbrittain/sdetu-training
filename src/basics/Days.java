package basics;

public class Days {
	public static void main(String[] args) {
		// Execute different block of code based on value of a condition
		
		String dayOfWeek = "Friday";
		
		switch (dayOfWeek) {
			case "Monday": 
				System.out.println("Today is Monday, boo back to work :(");
				break;
			case "Tuesday": 
				System.out.println("Today is Tuesday, still not the weekend");
				break;
			case "Wenesday" : 
				System.out.println("Today is Wenesday, hummpday yippy!");
				break;
			case "Thursday" : 
				System.out.println("Today is Thursday, almost there!");
				break;
			case "Friday" : 
				System.out.println("Today is Friday, fuck ya, you made it!");
				break;
		}
	}

}
