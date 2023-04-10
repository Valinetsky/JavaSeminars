/*
Напишите программу, которая реализует стек, используя список.
Петя и стул-капуста

input
4
push T-short
push Short
pop
push Jeans
*/

package Seminar04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println("Input numbers of records: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.printf("Input record %d\n", i + 1);
			list.add(scanner.nextLine());
		}
		ArrayList<String> Music = new ArrayList<>();
		for (String string : list) {

			String[] inputString = string.split(" ");

			if (inputString[0].equals("push")) {
				System.out.println("Enter");
				Music.add(inputString[1]);

			}
			if (inputString[0].equals("pop")) {
				System.out.println("Ivan takes: " + Music.remove(Music.size() - 1));
			}
		}
		System.out.println(Music);
	}
}

// push T-short
// push Short
// pop
// push Jeans
