/*
     Пусть дан список сотрудников:

Иван Иванов

Светлана Петрова

Кристина Белова

Анна Мусина

Анна Крутова

Иван Юрин

Петр Лыков

Павел Чернов

Петр Чернышов

Мария Федорова

Марина Светлова

Мария Савина

Мария Рыкова

Марина Лугова

Анна Владимирова

Иван Мечников

Петр Петин

Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. 
 *
 */


package Seminar05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HomeWorkTask02 {

    private static String getFirstWord(String sentence){
        String delimiter = " "; //Blank space is delimiter here
        String[] words = sentence.split(delimiter);
        return words[0];
    }

    public static void main(String[] args) {
        String[] probe = {            
                    "Иван Иванов", 
                    "Светлана Петрова",
                    "Кристина Белова",
                    "Анна Мусина",
                    "Анна Крутова",
                    "Иван Юрин",
                    "Петр Лыков",
                    "Павел Чернов",
                    "Петр Чернышов",
                    "Мария Федорова",
                    "Марина Светлова",
                    "Мария Савина",
                    "Мария Рыкова",
                    "Марина Лугова",
                    "Анна Владимирова",
                    "Иван Мечников",
                    "Петр Петин",
                    "Иван Ежов",
    };


		List<String> lst = Arrays.asList(probe);
		
		TreeMap<String, Integer> myMap = new TreeMap<>(Comparator.);
		for (String myStr : lst) {
            String localName = getFirstWord(myStr);
			if (myMap.containsKey(localName)) {
				myMap.put(localName, myMap.get(localName) + 1);
			} else {
				myMap.put(localName, 1);
			}
		}

        // TreeMap<String, Integer> mySortedMap = TreeMap<>(myMap);

		System.out.println(myMap);
        System.out.println(myMap.sort);

    }
    
}
