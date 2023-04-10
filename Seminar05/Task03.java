/*
Дана последовательность чисел
Необходимо вернуть количество совпадающих пар

[1, 1, 1, 2, 2]

4
*/

package Seminar05;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task03 {


	public static void main(String[] args) {
		int result = 0;
		List<Integer> myArr = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3);

		
		// Работает с помощью Collections
		Set<Integer> mySet = new HashSet<Integer>(myArr);
		for(Integer number: mySet){
			int localCount = Collections.frequency(myArr, number);

		// System.out.println(number + " " + localCount);

		// Формула количесва пар из количества элементов
		result = result + localCount * (localCount - 1) / 2; 
		}


		//// Работает просто циклом!
		// for (int i = 0; i < myArr.size() - 1; i++) {
		// 	for (int j = i + 1; j < myArr.size(); j++) {
		// 		if (myArr.get(i) == myArr.get(j)) {
		// 			result++;
		// 		}
		// 	}
		// }
		

		System.out.println(myArr);
		System.out.println(result);
	}
}
