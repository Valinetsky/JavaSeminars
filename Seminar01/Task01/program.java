/* // Улитка ползет по вертикальному шесту высотой h метров, 
// поднимаясь за день на a метров, а за ночь спускаясь на b метров. 
// На какой день улитка доползет до вершины шеста?
// Программа получает на вход натуральные числа h, a, b.
// Программа должна вывести одно натуральное число. 
// Гарантируется, что a>b.
Ввод 10 3 2
Вывод 8
*/

import java.util.Scanner;

public class program {

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

		int number_h = getInt("Введите целое число h: ");
		int number_a = getInt("Введите целое число a: ");
		int number_b = getInt("Введите целое число b: ");

		boolean flag = true;
		int counter = 0;
		int destination = 0;
		while (flag) {
			destination = destination + number_a;
			counter++;
			if (destination >= number_h) {
				flag = false;
			}
			destination = destination - number_b;
		}

		System.out.format("За %d дней улитка доберется до вершины шеста", counter);
	}
}
