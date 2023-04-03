/*
Напишите программу, которая считает натуральное число n с клавиатуры
и создаст список, в котором первый и последний элементы будут = 1,
а между ними будут 0.
Вывести список на экран через пробел.
*/

package Seminar03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01 {

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
		int number = getInt("Input number: ");
		List<Integer> listNumber = new ArrayList<>(number);
		for (int i = 0; i < number; i++) {
			listNumber.add(0);
			System.out.println(listNumber.get(i));
		}
		listNumber.set(0, 1);
		listNumber.set(listNumber.size() - 1, 1);
		System.out.println(listNumber);
		for (Integer integer : listNumber) {
			System.out.print(integer);
			System.out.print(" ");
		}
	}

	// в конце программы добавить
	// scan.close();

}
