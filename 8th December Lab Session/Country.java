/*Problem Statement:
1.Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
2.Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.*/

package Array_assignment;
import java.util.HashSet;
import java.util.Iterator;

public class Country { //Country class
	HashSet<String> H1 = new HashSet<>(); //Creating HashSet named H1
	
	public HashSet<String> storeCountryNames(String CountryName) { //Creating method to store countrynames in Hashset
		H1.add(CountryName);
		return H1;
	}
	
	public String retrieveCountry(String CountryName) { //Creating method to search and retrieve country names from hashset
		Iterator<String> itr = H1.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
	
	public static void main(String[] args) { //Main method
		Country ctry = new Country(); //Creating Country object
		ctry.storeCountryNames("India");
		ctry.storeCountryNames("Bangladesh"); //Adding values on Hashset using method
		ctry.storeCountryNames("Pakistan");
		ctry.storeCountryNames("Nepal");

		System.out.println("Bangladesh: " + ctry.retrieveCountry("Bangladesh")); //Retrieving values from hashset using method
		System.out.println("China: " + ctry.retrieveCountry("China"));		
	}
}
