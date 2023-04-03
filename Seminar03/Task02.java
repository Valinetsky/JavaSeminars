/*
Читаем с клавиатуры Н, создаем список со строками от 0 до Н - 1
Потом читаем М <= Н. И строку С. Строку С ставим в список на позицию М

*/

package Seminar03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();

		List<String> listNumber = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			listNumber.add(Integer.toString(i));

			System.out.println(listNumber.get(i));
		}

		int m = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();

		listNumber.set(m, s);

		System.out.println(listNumber);
	}

}
