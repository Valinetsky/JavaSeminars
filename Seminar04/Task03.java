/*
Проверка массива на палиндромность
*/

package Seminar04;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task03 {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 2, 1));
		System.out.println(checkOn(deque) ? "Палиндром" : "Не палиндром");
	}

	public static boolean checkOn(Deque<Integer> deque) {
		for (int i = 0; i < deque.size() / 2; i++) {
			if (deque.pollFirst() != deque.pollLast()) {
				return false;
			}
		}
		return true;
	}
}
