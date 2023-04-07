/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
*/

package Seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkTask02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(74, 99, 34, -9, 34, 58, 864));

		System.out.println(list);

		for (int i = list.size() - 1; i >= 0; --i) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}
