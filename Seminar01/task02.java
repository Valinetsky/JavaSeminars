/*
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
если разрешается сделать один разлом по прямой между дольками 
(то есть разломить шоколадку на два прямоугольника).
*/

import java.util.Scanner;

public class task02 {

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

		int numberX = getInt("Введите ширину шоколадки: ");
		int numberY = getInt("Введите длину шоколадки: ");
		int chokoPart = getInt("Введите число долек на отлом: ");

		if (chokoPart < numberX * numberY && ((chokoPart % numberX == 0) || (chokoPart % numberY == 0))) {
			System.out.println("Можно отломить");
		} else {
			System.out.println("Не получится отломить");
		}
		scan.close();
	}
}