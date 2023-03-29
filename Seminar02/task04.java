/*
 * Task_4

// Вводится строчка текста, затем, на следующей строке, одна буква латинского
// алфавита. Найдите, сколько раз в тексте встречается введённый символ в любом
// регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего
// регистров.

// Sample Input:

// Good morning my dear friend. My fish.
// m
// Sample Output:

// 3
 */

package Seminar02;

public class task04 {
    public static void main(String[] args) {
        String str = "Good morning my dear friend. My fish.";
        String myStr = str.toLowerCase();
        char ch = 'm';
        int counter = 0;
        for (int i = 0; i < myStr.length(); i++)
        {
            if (myStr.charAt(i) == ch) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
