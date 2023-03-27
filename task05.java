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

		int numberA = getInt("Введите число A: ");
		int numberB = getInt("Введите число B: ");
		int numberC = getInt("Введите число C: ");

		while (numberA > numberB){
			System.out.println(numberA);
			numberA = numberA - numberC;
		}		

	}
}