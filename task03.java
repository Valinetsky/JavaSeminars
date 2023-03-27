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

	static Double getFloat(String prompt) {
		System.out.print(prompt);
		while (true) {
			try {
				return Double.parseDouble(new Scanner(System.in).next());
			} catch (NumberFormatException ne) {
				System.out.print("Не удалось распознать число.\n" + prompt);
			}
		}
	}

	public static void main(String[] args) {

		double numberX = getFloat("Введите расстояние первого дня: ");
		double numberY = getFloat("Введите расчетное расстояние: ");
		System.out.println(numberX);
		System.out.println(numberY);
		double percent = 1.1;
		System.out.println(percent);
		double numberZ = getFloat("Стоп: ");
		int counter = 1;

		while (numberX < numberY) {
			numberX = numberX * percent;
			System.out.println(numberX);
			counter++;
		}
		System.out.println(counter);

	}
}