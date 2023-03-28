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

	static int getInt(String prompt) {
		System.out.print(prompt);
		while (true) {
			try {
				return Integer.parseInt(new Scanner(System.in).next());
			} catch (NumberFormatException ne) {
				System.out.print("Не удалось распознать число.\n" + prompt);
			}
		}
	}


	public static void main(String[] args){

        int arraySize = getInt("Input array size: ");

		int[] array = new int[arraySize];
	
		for (int i = 0; i < array.length; i++) {
			array[i] = getInt("Input array element: ");
			System.out.println(array[i]);
		}

		int number = getInt("Input number: ");

        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] * number);
		}
	}
}
	


