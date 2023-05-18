package arraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> country = new ArrayList<String>();
		
		country.add("India");
		country.add("USA");
		country.add("Brazil");
		country.add("Newzealand");
		
		System.out.println("1st country "+country.get(0));
		System.out.println("2nd country "+country.get(1));
		System.out.println("3rd country "+country.get(2));
		System.out.println("4th country "+country.get(3));
		
		country.set(2, "UK");
		System.out.println("3rd country "+country.get(2));
	}

}
