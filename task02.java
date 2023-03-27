/*
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
если разрешается сделать один разлом по прямой между дольками 
(то есть разломить шоколадку на два прямоугольника).
*/

import java.util.Scanner;

public class task02 {

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

		int numberX = getInt("Введите ширину шоколадки: ");
		int numberY = getInt("Введите длину шоколадки: ");
		int chokoPart = getInt("Введите число долек на отлом: ");
		
		if (chokoPart < numberX * numberY && ((chokoPart % numberX == 0) || (chokoPart % numberY == 0))) {
			System.out.println("Можно отломить");
		} else {
			System.out.println("Не получится отломить");
		}
	}
}