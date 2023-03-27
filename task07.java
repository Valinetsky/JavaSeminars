/*
Дан список. Выведите те его элементы, которые встречаются в списке только один раз. 
Элементы нужно выводить в том порядке, в котором они встречаются в списке.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input:

6
1
2
2
3
3
3
Sample Output:

1
*/

import java.util.Scanner;

public class task07 {

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

	}
}