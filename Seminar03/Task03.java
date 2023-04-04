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
		
		System.out.println("MERGE SORT");
		System.out.println(list);
		System.out.println(mergeSort(list));

		System.out.println("SELECTION SORT");
		System.out.println(list);
		System.out.println(selectionSort(listNegative));
	}

// ============================================================================================
// MERGE SORT
	public static List<Integer> mergeSort(List<Integer> list) {
        // базовый случай выхода из рекурсии, когда массив имеет 0 или 1 элемент
		if (list.size() <= 1) { 
			return list;
		} else {
			// число, относительно которого разделяем массивы
            int delimiter = list.get(0); 
			// левая сторона - числа меньше delimiter
            List<Integer> left = new ArrayList<>(); 
			// правая сторона - числа больше delimiter
            List<Integer> right = new ArrayList<>(); 
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) < delimiter) {
					left.add(list.get(i));
				} else {
					right.add(list.get(i));
				}
			}
            // вызываем sort у новых массивов
			return merger(mergeSort(left), delimiter, mergeSort(right)); 
		}
	}

	// соединяем левую сторону + delimiter + правую сторону
	private static List<Integer> merger(List<Integer> left, int del, List<Integer> right) {
		left.add(del);
		left.addAll(right);
		return left;
	}

// ===========================================================================================
// SELECTION SORT
	public static List<Integer> selectionSort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			// min is the index of the smallest element with an index greater or equal to i
			int min = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(min)) {
					min = j;
				}
			}
			// Swapping i-th and min-th elements
			int swap = list.get(i);
			list.set(i, list.get(min));
			list.set(min, swap);
		}
		return list;
	}
}
