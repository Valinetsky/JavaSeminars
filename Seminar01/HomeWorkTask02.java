/*
Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.

Sample Input:

4
1
2
3
5
2
Sample Output:

2
4
6
10
*/

import java.util.Scanner;

public class HomeWorkTask02 {

	private static Scanner scan = new Scanner(System.in);

	static int getInt(String prompt) {
		boolean flag = true;
		int i = -1;
		while (flag) {
			System.out.print(prompt);
			if (scan.hasNextInt()) {
				i = scan.nextInt();
				flag = false;
			} else {
				// Ввод неверной информации
				System.out.println("Не удалось распознать число.");
				scan.nextLine();
			}
		}
		return i;
	}

	public static void main(String[] args) {

		int arraySize = getInt("Input array size: ");

		int[] array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Waiting for array element %d\n", i);
			array[i] = getInt("Input number: ");
		}

		int number = getInt("Input multiplier: ");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] * number);
		}
	}
}
