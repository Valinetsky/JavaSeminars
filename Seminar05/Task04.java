/*
Массив путей
Показать путь

[["Moscow", "Samara"], ["Kursk", "Pensa"], ["Samara", "Kursk"]]

Pensa
*/

package Seminar05;

import java.util.HashMap;
import java.util.Map;

public class Task04 {

	public static void main(String[] args) {

		// Тут все однозначно: Москва - Пенза
		// String[][] probe = {
		// {"Moscow", "Samara"},
		// {"Kursk", "Pensa"},
		// {"Samara", "Kursk"}
		// };

		// А тут доезжает до Питера, хотя мог бы и в Москву вернуться
		String[][] probe = {
				{ "Moscow", "Samara" },
				{ "Kursk", "Moscow" },
				{ "Samara", "Kursk" },
				{ "SomeCity", "St.Petersburg" },
				{ "Kursk", "SomeCity" },
		};

		String start = probe[0][0];
		String finish = probe[0][1];
		System.out.printf("Route start: %s\n", start);

		// Преобразуем массив в HashMap
		Map<String, String> map = new HashMap<>();
		for (String[] strings : probe) {
			map.put(strings[0], strings[1]);
		}
		System.out.println(map);

		// Поехали!
		int hop = 0;
		boolean flag = true;
		while (flag) {
			if (map.containsKey(start)) {
				finish = map.get(start);
				map.remove(start);
				start = finish;
				hop++;
			} else {
				System.out.println("Finish:");
				// System.out.println(finish);
				flag = false;
			}
		}
		System.out.println(finish);
		System.out.printf("Hop(s) on route: %d\n", hop);
	}
}
