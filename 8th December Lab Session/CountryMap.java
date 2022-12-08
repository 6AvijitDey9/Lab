/*Problem Statement :
1.Develop a java class with a instance variable CountryMap  HashMap (M1)  add a method storeCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country	Value - Capital
India	Delhi
Japan	Tokyo

2.Develop a method retrieveCapital(String CountryName) which returns the capital for the country passed from the Map M1 created in step 1.
3.Develop a method retrieveCountry(String capitalName) which returns the country for the capital name passed from the Map M1 created in step 1.
4.Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key - Capital	Value – Country
Delhi	India
Tokyo	Japan
1.Develop a method which iterates through the map M1 and creates a ArrayList with all the Country names stored as keys. This method should return the ArrayList.

NOTE: You can test the methods using a main method.*/


package Array_assignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap { //Creating CountryMap class
	 HashMap<String, String> M1=new HashMap<String, String>(); //Creating new HashMap named M1
	public HashMap<String, String> storeCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital); //Creating method storeCountryCapital to store key and value in hashmap
		return M1;
	}
	public String retrieveCapital(String CountryName) {
		return M1.get(CountryName); //Creating method retrieveCapital to retrieve capital
	}
	public String retrieveCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet(); //Entering hashmap
		Iterator<Entry<String, String>> it = set.iterator(); //Iterating through hashmap using iterator object
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next(); //Traversing
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	public HashMap<String, String> KyeValueswaping() { //A method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
		HashMap<String, String> M2 = new HashMap<String, String>();
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}	
		return M2;
	}
	public ArrayList<String> toArrayList() { //A method which iterates through the map M1 and creates a ArrayList with all the Country names stored as keys. This method should return the ArrayList.
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey()); //Storing key values of Map in ArrayList
		}
		
		return list;
	}
	public static void main(String[] args) { //Main Method
		CountryMap countryMap = new CountryMap();

		countryMap.storeCountryCapital("India", "Delhi"); //Storing country and capitals in Map
		countryMap.storeCountryCapital("Japan", "Tokyo");
		countryMap.storeCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.retrieveCapital("India")); //Retrieving capital of countries
		System.out.println(countryMap.retrieveCountry("Tokyo"));
		System.out.println(countryMap.toArrayList()); //Converting Map to ArrayList
		HashMap<String, String> M2 = countryMap.KyeValueswaping();
		System.out.println(M2); //Output of swapKyeValue method
	}
}
