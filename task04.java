/*
Факториал числа
*/

import java.util.Scanner;

public class task04 {

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

		int numberX = getInt("Введите число: ");

		System.out.println("Факториал равен");
		int factor = 1;
		if (numberX > 0) {
			for (int i = 1; i <= numberX; i++) {
				factor = factor * i;
			}
		}
		System.out.println(factor);
	}
}