/*
Дан текст
Определить, сколько различных слов в тексте.
Слова разделены одним или большим количеством пробелов 
или символами конца строки

input
4

She sells sea shells on the sea shore; 
The shells that she sells are sea shells I’m sure. 
So if she sells sea shells on the sea shore, 
I’m sure that the shells are sea shore shells.



Output
19
*/

package Seminar05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task05 {
	public static void main(String[] args) {

		String inputString = """
				She sells sea shells on the sea shore;
				The shells that she sells are sea shells I'm sure.
				So if she sells sea shells on the sea shore,
				I'm sure that the shells are sea shore shells.
				""";

		List<String> inputStringArr = Arrays.asList(inputString.replaceAll("[\r\n]+", " ").split(" "));
		// System.out.println(inputStringArr);
		// System.out.println(inputStringArr.size());

		Set<String> mySet = new HashSet<>(inputStringArr);
		System.out.println(mySet);
		System.out.println(mySet.size());

		// int count = 1;
		// for (String string : mySet) {
		// System.out.printf("Element %d - %s\n", count, string);
		// count++;
		// }
	}
}
