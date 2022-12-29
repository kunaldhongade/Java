import java.io.*;
import java.util.*;

public class Question2 {
	public static void main(String[] arg) {
		String city;
		int n;
		Scanner sc = new Scanner(System.in);
		Hashtable cities = new Hashtable();
		cities.put("New Delhi", 11);
		cities.put("Mumbai", 22);
		cities.put("Kolkata", 33);
		cities.put("Chennai", 44);
		cities.put("Hyderabad", 40);
		cities.put("Bangalore", 80);
		cities.put("Pune", 20);
		cities.put("Ahmedabad", 79);
		cities.put("Jaipur", 141);
		cities.put("Guwahati", 361);
		cities.put("Puducherry", 413);
		while (true) {
			System.out.print(
					"\n\n\n1.Add new city and STD code.\n2.Remove city.\n3.Search for city.\n4.Display Records.\n5.Exit.\nEnter Choise:");
			n = sc.nextInt();
			switch (n) {
				case 1:
					System.out.print("Enter City name:");
					city = sc.next() + sc.nextLine();
					if (cities.containsKey(city)) {
						System.out.println("Entered city name is already in records.");
					} else {
						System.out.print("\nEnter STD code :");
						int a = sc.nextInt();
						cities.put(city, a);
					}
					break;

				case 2:
					System.out.print("Enter City name to remove from records : ");
					city = sc.next() + sc.nextLine();
					if (cities.containsKey(city)) {
						cities.remove(city);
						System.out.println("Record removed Succesfully.");
					} else {
						System.out.println("Con't Remove record becouse City is not in Record");
					}
					break;

				case 3:
					System.out.print("Enter name of city to search : ");
					city = sc.next() + sc.nextLine();
					Enumeration city_name = cities.keys();
					Enumeration std = cities.elements();
					while (city_name.hasMoreElements() && std.hasMoreElements()) {
						String str = (String) city_name.nextElement();
						n = (int) std.nextElement();
						if (city.equals(str)) {
							System.out.printf("%20s %20s\n", "CITY_NAME", "STD CODE");
							System.out.printf("%20s %20s\n", str, n);
						}
					}
					break;

				case 4:
					Enumeration city_name2 = cities.keys();
					Enumeration std2 = cities.elements();
					System.out.printf("%20s %20s\n", "City Name", "STD Code");
					while (city_name2.hasMoreElements() && std2.hasMoreElements()) {
						System.out.printf("%20s %20s\n", city_name2.nextElement(), std2.nextElement());
					}

					break;
				case 5:
					System.exit(0);
					break;

				default:
					System.out.println("Invalid Output.");
			}
		}
	}

}