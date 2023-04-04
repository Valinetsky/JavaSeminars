/*
Дан список, содержащий строки и числа в строковом формате.
Пройти по с писку с помощью итератора и вывести в консоль 
что является строкой, что - числом
*/

package Seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));

		printResultOfCheck(list);
	}

	public static void printResultOfCheck(List<String> list) {
		for (String string : list) {
			System.out.print(string + " - ");
			if (isNumeric(string)) {
				System.out.println("Number");
			} else
				System.out.println("String");
		}
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
