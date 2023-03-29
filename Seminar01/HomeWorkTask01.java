/*
Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
Затем вводятся 2 числа из этого диапазона. 
Используя данные из массива найдите их кубы.

Sample Input:
8
11
Sample Output:

512
1331
*/

import java.util.Scanner;

public class HomeWorkTask01 {

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

		int[] cubeArray = new int[1000];

		for (int i = 0; i < cubeArray.length; i++) {
			cubeArray[i] = (i + 1) * (i + 1) * (i + 1);
			// System.out.println(cubeArray[i]);
		}

		int number_first = getInt("Input first number: ");
		int number_second = getInt("Input second number: ");

		System.out.printf("Array element on index[%d]: ", number_first);
		System.out.println(cubeArray[number_first - 1]);
		System.out.printf("Array element on index[%d]: ", number_second);
		System.out.println(cubeArray[number_second - 1]);

	}
}
