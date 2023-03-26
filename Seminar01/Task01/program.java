// Улитка ползет по вертикальному шесту высотой h метров, 
// поднимаясь за день на a метров, а за ночь спускаясь на b метров. 
// На какой день улитка доползет до вершины шеста?
// Программа получает на вход натуральные числа h, a, b.
// Программа должна вывести одно натуральное число. 
// Гарантируется, что a>b.

import java.util.Scanner;

public static void main(String[] args) {

	public static int inputNumber(message){ //идентификатор доступа, функция является статичной, тип возвращаемого значения, имя функции без параметров
		System.out.println(message);Scanner reader=new Scanner(System.in); // Reading from System.in
		int number=reader.nextInt(); // Scans the next token of the input as an int.
		reader.close();
		return number; //возвращаем значение при вызове данной функции
	}

inputNumber("Введите число: ")
}
