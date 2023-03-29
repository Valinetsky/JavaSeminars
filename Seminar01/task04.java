/*
Факториал числа
*/

import java.util.Scanner;

public class task04 {

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

		int numberX = getInt("Введите число (n >= 0): ");

		System.out.println("Факториал равен");
		int factor = 1;
		if (numberX > 0) {
			for (int i = 1; i <= numberX; i++) {
				factor = factor * i;
			}
		}
		System.out.println(factor);

		// в конце программы добавить
		scan.close();
	}
}