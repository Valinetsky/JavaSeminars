package Seminar03;

import java.util.ArrayList;
import java.util.List;

public class Task0 {

	public static void main(String[] args) {
		List<String> listString = new ArrayList<>();
		listString.add("Red");
		listString.add("Green");
		listString.add("Blue");
		listString.add("White");
		for (String string : listString) {
			System.out.println(string);
		}
		System.out.println(listString.get(0));

		listString.set(0, "Yellow");

		listString.remove(3);
		System.out.println(listString);
		boolean probe = listString.contains("Red");
		System.out.println(probe);
	}
}
