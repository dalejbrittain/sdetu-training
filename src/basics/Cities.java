package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define an array
		String[] cities = {"New York City", "Denver", "Evergreen", "Salt Lake"};
		System.out.println(cities[0] + ", " + cities[1] + ", "+  cities[2] + ", "+ cities[3] );
		
		String[] states = new String[3];
		states[0] = "Colorado";
		states[1] = "Utah";
		states[2] = "New Jersey";
		
		System.out.println("+++++++++++++++++++++++++++");
		
		int i=0;
		do {
			System.out.println(states[i]);
			i++;
			}while (i<3);
		

		System.out.println("+++++++++++++++++++++++++++");
		
		int n = 0;
		boolean cityFound = false;
		while (!cityFound) {
			String city = cities[n];
			System.out.println(city);
			if (city == "Evergreen") {
				System.out.println("City found!");
				cityFound = true;
			}
			n++;
			
			
		}
		
		System.out.println("+++++++++++++++++++++++++++");
			for (int x =0; x < 5; x++) {
				System.out.println(states[x]);
			}
			
		}
		

	}


