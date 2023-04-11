package Seminar05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeWorkTask01 {

	// добавляем номера в телефонную книгу
	public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
		if (map.containsKey(key)) {
			map.get(key).add(value);
		} else {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(value);
			map.put(key, list);
		}
	}

	// выводим телефонную книгу
	public static void printBook(Map<String, ArrayList<Integer>> map) {
		for (var item : map.entrySet()) {
			String phones = "";
			for (int element : item.getValue()) {
				phones = phones + element + " ";
			}
			phones = phones.trim().replaceAll(" ", ", ");
			System.out.printf("%s: %s \n", item.getKey(), phones);
		}
	}

	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
		addNumber("Saveliev", 54892, bookPhone);
		addNumber("Novikov", 11111111, bookPhone);
		addNumber("Lobanov", 222, bookPhone);
		addNumber("Saveliev", 634561111, bookPhone);
		addNumber("Saveliev", 6345646, bookPhone);
		addNumber("Saveliev", 02546, bookPhone);
		addNumber("Petrov", 5566, bookPhone);
		addNumber("Ivanov", 77777777, bookPhone);
		addNumber("Sokolov", 88, bookPhone);
		printBook(bookPhone);
	}
}