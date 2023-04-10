/*
Вводится число Н - (размер массива), затем несколько несколько целых чисел
Определить сколько уникальных чисел введено (в массив)

7
1 1 2 2 2 3 3

3
*/

package Seminar05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task01 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input array size: ");
		int n = sc.nextInt();
		int number;
		ArrayList<Integer> lst = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			number = sc.nextInt();
			lst.add(number);
		}
		Set<Integer> mySet = new HashSet<>();
		for (Integer object : lst) {
			mySet.add(object);
		}
		System.out.println(mySet);
	}
}
