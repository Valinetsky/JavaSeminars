/*
Task_5
import java.util.Deque;

public class Task_5 {

//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static void main(String[] args) {

}

public boolean validate(Deque<Integer> deque){

    return false;
}
}
*/
package Seminar04;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HomeWorkTask05 {

	public static void main(String[] args) {
		// входная строка
		String s = "({[]{Roman}})";
		System.out.println(s);
		System.out.println(validate(s));
	}

	private static boolean validate(String input) {
		// создаем словарь
		Map<Character, Character> brackets = new HashMap<>();
		brackets.put(')', '(');
		brackets.put('}', '{');
		brackets.put(']', '[');

		Deque<Character> stack = new LinkedList<>();

		for (char c : input.toCharArray()) {
			if (brackets.containsValue(c)) {

				// одна из открывающих скобок
				stack.push(c);

			} else if (brackets.containsKey(c)) {

				// одна из закрывающих скобок
				if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
					return false;
				}
			}
		}
		// в конце стек должен быть пустым
		return stack.isEmpty();
	}
}