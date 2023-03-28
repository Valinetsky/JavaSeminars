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


	public static void main(String[] args){

		int[] cubeArray = new int[1000];
	
		for (int i = 0; i < cubeArray.length; i++) {
			cubeArray[i] = (i + 1) * (i + 1) * (i + 1);
			System.out.println(cubeArray[i]);
		}

		int number_first = getInt("Input first number: ");
		int number_second = getInt("Input second number: ");

		System.out.println("Array element on index[first number]: ");
		System.out.println(cubeArray[number_first - 1]);
		System.out.println("Array element on index[second number]: ");
		System.out.println(cubeArray[number_second - 1]);
		
	}
}
	


