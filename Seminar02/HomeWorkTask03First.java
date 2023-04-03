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

import java.util.Scanner;

import java.util.logging.*;

public class HomeWorkTask03First {
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

		Logger logger = Logger.getLogger(HomeWorkTask03First.class.getName());
		logger.setLevel(Level.INFO);
		ConsoleHandler ch = new ConsoleHandler();
		logger.addHandler(ch);
		SimpleFormatter sFormat = new SimpleFormatter();
		// XMLFormatter xml = new XMLFormatter();
		ch.setFormatter(sFormat);
		// ch.setFormatter(xml);
		logger.log(Level.WARNING, "Test log");
		logger.info("Test log");

		// Забавный бесконечный цикл для понимания байтового формата и переполнения
		// for (byte i = 1; i <= 200; i++) {
		// System.out.println(i);
		// }

		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		String myCurrentDir = System.getProperty("user.dir");
		String myFilePath = myCurrentDir + File.separator + "result.txt";

		File file = new File(myFilePath);
		FileOutputStream fileOutputStream = new FileOutputStream(file);

		byte myByteToFile = getByte("Input number in byte format: ");

		fileOutputStream.write(myByteToFile);

		fileOutputStream.close();
	}
}
