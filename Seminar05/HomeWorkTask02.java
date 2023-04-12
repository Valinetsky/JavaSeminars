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

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HomeWorkTask02 {

    // Получаем первое слово из строки (Имя) 
    private static String getFirstWord(String sentence){
        String delimiter = " ";
        String[] words = sentence.split(delimiter);
        return words[0];
    }


    // Сортируем карту по значениям в порядке убывания
    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =  new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) return 1;
                else return compare;
            }
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
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
		
		TreeMap<String, Integer> myMap = new TreeMap<>();
		for (String myStr : lst) {
            String localName = getFirstWord(myStr);
			if (myMap.containsKey(localName)) {
				myMap.put(localName, myMap.get(localName) + 1);
			} else {
				myMap.put(localName, 1);
			}
		}

        System.out.println();
        System.out.println("Карта - имя : количество вхождений в список");
		System.out.println(myMap);
        System.out.println();
        System.out.println("Та же карта, отсортированная по количеству вхождений в порядке убывания");
        System.out.println(sortByValues(myMap));
    }
}
