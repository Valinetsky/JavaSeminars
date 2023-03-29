/*
Вводится массив (сначала количество элементов, потом сами элементы)
Найдите сумму его элементов с четными индексами и выведете ее.
Затем выведете числа, которые суммировались.
*/

import java.util.Scanner;

public class task06 {

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

		int arr_size = getInt("Введите размер массива: ");

		int[] myArray = new int[arr_size];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = getInt("Введите элемент массива: ");
		}

		int summ = 0;
		for (int i = 0; i < myArray.length; i = i + 2) {
			summ = summ + myArray[i];
		}
		System.out.println("Ноль - четное число!");
		System.out.printf("Сумма элементов = %d\n", summ);
		System.out.println("Вывод суммируемых элементов массива:");
		for (int i = 0; i < myArray.length; i = i + 2) {
			System.out.printf("Элемент по индексу %d: %d\n", i, myArray[i]);
		}
		// в конце программы добавить
		scan.close();
	}
}