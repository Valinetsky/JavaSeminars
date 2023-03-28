/*
Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
Затем вводятся 2 числа из этого диапазона. 
Используя данные из массива найдите их кубы.

Sample Input:
8
11
Sample Output:

512
1331
*/

import java.util.Scanner;

public class HomeWorkTask01 {

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

	int[] cubeArray = new int[1000];
	
	for

}
