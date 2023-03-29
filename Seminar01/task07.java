/*
Дан список. Выведите те его элементы, которые встречаются в списке только один раз. 
Элементы нужно выводить в том порядке, в котором они встречаются в списке.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input:

6
1
2
2
3
3
3
Sample Output:

1
*/

public class task07 {

	// Общий метод для проверки дубликатов в массиве
	static void checkForDuplicates(int[] array) {
		// для каждого элемента массива проверяем, встречается ли он потом в массиве
		for (int i = 0; i < array.length; i++) {
			int j = 0;
			boolean flag = true;
			boolean count_double = false;
			while (flag) {
				if (array[j] == array[i] && i != j) {
					count_double = true;
					flag = false;
				}
				j++;
				if (j >= array.length) {
					flag = false;
				}
			}
			// System.out.println(count_double);
			if (!count_double) {
				System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] myArray = new int[] { 8, 1, 2, 2, 3, 3, 3, 5, 7, 12, 12, 13, 4, 4 };
		checkForDuplicates(myArray);

	}
}
