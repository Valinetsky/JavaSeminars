/*
 * // Task_5
// Вводится строка, определите, каких символов в ней больше: цифр или букв?
// Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни
// другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе
// выведите "Letter". Если же их равное количество, то выведите слово "Equal".

// Sample Input:

// 34Hi56
// Sample Output:

// Digit
 */
package Seminar02;

public class task05 {
    public static void main(String[] args) {
        String str = "34Hi56";
        str = str.toLowerCase();
        int countDigit = 0;
        int countLetter = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                countLetter++;
                System.out.println(countLetter);
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                countDigit++;
                System.out.println(countDigit);
            }
        }
        if (countLetter > countDigit) {
            System.out.println("Letter");
        }
        if (countLetter < countDigit) {
            System.out.println("Digit");
        }
        if (countLetter == countDigit) {
            System.out.println("Equal");
        }
    }
}
