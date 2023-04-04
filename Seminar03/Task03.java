/*
 * Sort array
 */

package Seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task03 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(75, 99, 34, -9, 34, 58, 864);
		List<Integer> listNegative = Arrays.asList(75, 99, 34, -9, 34, 58, 864);
		System.out.println(sortByCollections(list));

	}

	public static List<Integer> sortByCollections(List<Integer> list) {

		if (list.size() <= 1) { // базовый случай выхода из рекурсии, когда массив имеет 0 или 1 элемент
			return list;
		} else {
			int delimiter = list.get(0); // число, относительно которого разделяем массивы
			List<Integer> left = new ArrayList<>(); // левая сторона - числа меньше delimiter
			List<Integer> right = new ArrayList<>(); // правая сторона - числа больше delimiter
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) < delimiter) {
					left.add(list.get(i));
				} else {
					right.add(list.get(i));
				}
			}
			return merger(sortByCollections(left), delimiter, sortByCollections(right)); // вызываем sort у новых
																							// массивов
		}
	}

	// соединяем левую сторону + delimiter + правую сторону
	private static List<Integer> merger(List<Integer> left, int del, List<Integer> right) {
		left.add(del);
		left.addAll(right);
		return left;
	}
}
