/*
Task_4. *
+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*/

/*
Леонид, приветствую! Возможно я сам себе усложнил задачу, но из условия сделал вывод, 
что число вида ? - лежит в диапазоне 0-9, вида ?? - в диапазоне 10-99, 
вида ??? - в диапазоне 100-999 и т.п.
Ручной ввод уравнения отключен. Включить можно раскомментировав строку 50, и закоментировав 51.
Пока тестил проще было в строке 51 ставить и убирать знаки '?'.
Алгоритм на словах: 
разбиваем строку на три части, каждую часть превращаем в массив возможных элементов с помощью regexp,
тройным вложенным циклом перебираем возможные комбинации, - при совпадении - выводим на экран.
Ну и в силу крайне лёгкого знакомства с JAVA - вопрос: VS Code не нравится строка 34. Что не так?
*/
import java.util.*;

public class HomeWorkTask04 {

	private static Scanner scan = new Scanner(System.in);

	public static int pow(int value, int powValue) {
		return (int) Math.pow(value, powValue);
	}

	public static ArrayList<Integer> numberToArr(String inputString) {
		String q_str_find = inputString.replace("?", "\\d");

		ArrayList<Integer> AI = new ArrayList();

		for (int i = 0; i < pow(10, inputString.length()); i++) {
			String number_string = Integer.toString(i);

			if (number_string.matches(q_str_find)) {
				AI.add(Integer.parseInt(number_string));
			}
		}
		return AI;
	}

	public static void main(String[] args) {

		System.out.print("Введите уравнение:\n");

		// String equation = scan.nextLine();
		String equation = "2? + ?5 = 69";

		String[] parts = equation.split("\s*[+=]\s*");

		ArrayList<Integer> q_list = new ArrayList<Integer>();
		q_list = numberToArr(parts[0]);
		// System.out.println(q_list);

		ArrayList<Integer> w_list = new ArrayList<Integer>();
		w_list = numberToArr(parts[1]);
		// System.out.println(w_list);

		ArrayList<Integer> e_list = new ArrayList<Integer>();
		e_list = numberToArr(parts[2]);
		// System.out.println(e_list);

		boolean noSolution = true;
		for (int i = 0; i < q_list.size(); i++) {
			for (int j = 0; j < w_list.size(); j++) {
				for (int k = 0; k < e_list.size(); k++) {
					if (q_list.get(i) + w_list.get(j) == e_list.get(k)) {
						System.out.printf("%d + %d = %d\n", q_list.get(i), w_list.get(j), e_list.get(k));
						noSolution = false;
					}
				}
			}
		}
		if (noSolution) {
			System.out.println("Нет решения");
		}
		scan.close();
	}
}
