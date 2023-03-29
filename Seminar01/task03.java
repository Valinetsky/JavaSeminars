/*
В первый день спортсмен пробежал x километров, 
а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
По данному числу y определите номер дня, на который пробег спортсмена
составит не менее y километров
Входные данные - два действительных числа x и y (10 20)
Выходные данные - одно натуральное число (9)
*/

import java.util.Scanner;

public class task03 {

	private static Scanner scan = new Scanner(System.in);

	static double getDouble(String prompt) {
		boolean flag = true;
		double i = -1;
		while (flag) {
			System.out.print(prompt);
			if (scan.hasNextDouble()) {
				i = scan.nextDouble();
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

		double numberX = getDouble("Введите расстояние первого дня: ");
		double numberY = getDouble("Введите расчетное расстояние: ");

		double percent = 1.1;

		int counter = 1;
		while (numberX < numberY) {
			numberX = numberX * percent;
			System.out.println(numberX);
			counter++;
		}
		System.out.printf("Время до увеличения пробега до расчетного расстояния, дней: %d", counter);

		scan.close();
	}
}