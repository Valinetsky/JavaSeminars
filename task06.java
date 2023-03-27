/*
Вводится массив (сначала количество элементов, потом сами элементы)
Найдите сумму его элементов с четными индексами и выведете ее.
Затем выведете числа, которые суммировались.
*/

import java.util.Scanner;

public class task06 {

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

	public static void main(String[] args) {

		int arr_size = getInt("Введите размер массива: ");

		int[] myArray = new int[arr_size];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = getInt("Введите элемент массива: ");
		}

		int summ = 0;
		for (int i = 0; i < myArray.length; i = i + 2) {
			summ = summ + myArray[i];
		}
		System.out.println(summ);
		for (int i = 0; i < myArray.length; i = i + 2) {
			System.out.println(myArray[i]);
		}

	}
}