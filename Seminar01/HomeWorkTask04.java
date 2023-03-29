/*
Task_4. *
+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*/

import java.util.*;

public class HomeWorkTask04 {

	private static Scanner scan = new Scanner(System.in);

	public static int pow(int value, int powValue) {
		return (int) Math.pow(value, powValue);
	}

	public String padLeftZeros(String inputString, int length) {
		if (inputString.length() >= length) {
			return inputString;
		}
		StringBuilder sb = new StringBuilder();
		while (sb.length() < length - inputString.length()) {
			sb.append('0');
		}
		sb.append(inputString);

		return sb.toString();
	}

	public static ArrayList<Integer> numberToArr(String inputString) {

		String q_str_find = inputString.replace("?", "\\d");

		ArrayList<Integer> AI = new ArrayList();
		// ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < pow(10, inputString.length()); i++) {
			// System.out.println(i);
			String number_string = Integer.toString(i);
			// System.out.println(number_string);

			if (number_string.matches(q_str_find)) {
				// System.out.println(number_string);
				AI.add(Integer.parseInt(number_string));
			}

		}
		// System.out.println(AI);
		return AI;
	}

	public static void main(String[] args) {

		System.out.print("Введите уравнение: ");

		// String equation = scan.nextLine();
		String equation = "2? + ?5 = 69";

		String[] parts = equation.split("\s*[+=]\s*");

		// System.out.println(parts[0]);
		// System.out.println(parts[1]);
		// System.out.println(parts[2]);

		ArrayList<Integer> q_list = new ArrayList<Integer>();
		q_list = numberToArr(parts[0]);
		System.out.println(q_list);

		ArrayList<Integer> w_list = new ArrayList<Integer>();
		w_list = numberToArr(parts[1]);
		System.out.println(w_list);

		ArrayList<Integer> e_list = new ArrayList<Integer>();
		e_list = numberToArr(parts[2]);
		System.out.println(e_list);

		int outputCounter = 0;
		for (int i = 0; i < q_list.size(); i++) {
			for (int j = 0; j < w_list.size(); j++) {
				for (int k = 0; k < e_list.size(); k++) {
					if (q_list.get(i) + w_list.get(j) == e_list.get(k)) {
						System.out.printf("%d + %d = %d\n", q_list.get(i), w_list.get(j), e_list.get(k));
						outputCounter++;
					}
				}
			}
		}
		if (outputCounter == 0) {
			System.out.println("Нет решения");

		}

		scan.close();
	}
}

// package lesson2;
// import java.util.Scanner;

// public class task2 {
// private static Scanner scan = new Scanner(System.in);
// public static void main(String[] args) {

// и можно везде вызывать и не закрывать))))

// Основные методы строк
// Метод Описание
// s.concat() объединяет строки
// s.length() возвращает длину строки
// s.valueOf() преобразует объект в строковый вид
// s.join() соединяет строки с учетом разделителя
// s.сompare() сравнивает две строки
// s.charAt() возвращает символ строки по индексу
// s.getChars() возвращает группу символов
// s.equals() сравнивает строки с учетом регистра
// s.equalsIgnoreCase() сравнивает строки без учета регистра
// s.regionMatches() сравнивает подстроки в строках
// s.indexOf() находит индекс первого вхождения подстроки в строку
// s.isEmpty() возвращает true, если строка пуста, иначе - false
// s.lastIndexOf() находит индекс последнего вхождения подстроки в строку
// s.startsWith() определяет, начинается ли строка с подстроки
// s.endsWith() определяет, заканчивается ли строка на определенную подстроку
// s.replace() заменяет в строке одну подстроку на другую
// s.trim() удаляет начальные и конечные пробелы
// s.substring() возвращает подстроку, начиная с определенного индекса до конца
// или до определенного индекса
// s.toLowerCase() переводит все символы строки в нижний регистр
// s.toUpperCase() переводит все символы строки в верхний регистр
// s.toCharArray() преобразовывает строку в массив символов

// Task_1
// Дана строка, в которой через пробел перечислены цифры. На следующей строке
// вводится цифра. Определите индексы первого и последнего её вхождения.

// Sample Input:

// 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
// 4
// Sample Output:

// 0
// 28

// Task_2

// Формат входных данных:
// На первой строке вводится любимая буква Маши, на второй - Олега. Затем
// вводится строка, в которой перечислены слова, которые написаны в газете.

// Формат выходных данных:
// На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько
// слов выписал Олег.

// Sample Input:

// а
// в
// Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
// Sample Output:

// 2
// 3

// Task_3

// Для того чтобы выходить в Интернет, каждому компьютеру присваивается так
// называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до
// 255, разделенных точками. В следующих трех строках показаны три правильных
// IP-адреса:

// 127.0.0.0
// 192.168.0.01
// 255.00.255.255
// Напишите программу, которая определяет, является ли заданная строка
// правильным IP-адресом.
// Входные данные
// На вход программе подается строка длиной не более 15 символов, которая
// включает цифры и точки.

// Выходные данные
// Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

// Примечание:
// У вас не получится просто так взять и создать строку, которая содержит точку.
// Иначе говоря строчка кода:

// String s = ".";
// просто на просто не сработает. Точнее сработает неверно. Для корректного
// создания строки, содержащей точку используйте экранирование.

// String s = "\\.";
// Sample Input 1:

// 192.168.1.2
// Sample Output 1:

// YES
// Sample Input 2:

// 192.11.690.0
// Sample Output 2:

// NO
// Sample Input 3:

// 67.67.67
// Sample Output 3:

// NO

// Task_4

// Вводится строчка текста, затем, на следующей строке, одна буква латинского
// алфавита. Найдите, сколько раз в тексте встречается введённый символ в любом
// регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего
// регистров.

// Sample Input:

// Good morning my dear friend. My fish.
// m
// Sample Output:

// 3

// Task_5
// Вводится строка, определите, каких символов в ней больше: цифр или букв?
// Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни
// другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе
// выведите "Letter". Если же их равное количество, то выведите слово "Equal".

// Sample Input:

// 34Hi56
// Sample Output:

// Digit

// Task_6

// public class Task_6 {

// //Напишите программу, которая принимает с консоли число в формате byte и
// записывает его в файл ”result.txt”.
// //Требуется перехватить все возможные ошибки и вывести их в логгер.
// //
// //После написания, попробуйте подать на вход числа 100 и 200 и проследите
// разницу в результате
// public static void main(String[] args) {

// }

// public String findJewelsInStones(String jewels, String stones){

// return "";
// }

// }