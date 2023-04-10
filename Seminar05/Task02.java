/*
Вводится число Н - (размер массива), затем несколько несколько целых чисел
Для каждого числа вывести YES если уже было в массиве, или НЕТ

7
1 1 2 2 2 3 3

no
yes
no
yes
yes
no
yes
*/

package Seminar05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task02 {

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
		for (Integer integer : lst) {
			if (mySet.add(integer)) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

		System.out.println(mySet);
	}

}
