/*
 * // Task_6

// public class Task_6 {

// //Напишите программу, которая принимает с консоли число в формате byte и
// записывает его в файл ”result.txt”.
// //Требуется перехватить все возможные ошибки и вывести их в логгер.
// //
// //После написания, попробуйте подать на вход числа 100 и 200 и проследите
// разницу в результате

 */
package Seminar02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
// import java.io.FileOutputStream;
import java.util.Scanner;

public class task06 {

	private static Scanner scan = new Scanner(System.in);

	static byte getByte(String prompt) {
		boolean flag = true;
		byte i = 0;
		while (flag) {
			System.out.print(prompt);
			if (scan.hasNextByte()) {
				i = scan.nextByte();
				flag = false;
			} else {
				// Ввод неверной информации
				System.out.println("Не удалось распознать число.");
				scan.nextLine();
			}
		}
		return i;
	}

	public static void main(String[] args) throws IOException {
		// for (byte i = 1; i <= 200; i++) {
		// System.out.println(i);
		// }

		File file = new File("C:\\Users\\Roman\\Desktop\\GB\\JAVA\\Seminar02\\text.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);

		// String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для
		// тех, кто хочет стать программистом!";

		byte myByteToFile = getByte("Input number in byte format: ");

		fileOutputStream.write(myByteToFile);

		fileOutputStream.close();
	}

}
