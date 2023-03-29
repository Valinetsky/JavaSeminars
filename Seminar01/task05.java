/*
Напишите программу, которая выводит в столбик целые числа от a до b с шагом c
a >= b. Границы включаются
Ввод 20 1 2
Вывод 20
18
16
,,,
2
*/

import java.util.Scanner;

public class task05 {

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

		int numberA = getInt("Введите число A: ");
		int numberB = getInt("Введите число B: ");
		int numberC = getInt("Введите число C: ");

		while (numberA > numberB) {
			System.out.println(numberA);
			numberA = numberA - numberC;
		}
		// в конце программы добавить
		scan.close();
	}
}