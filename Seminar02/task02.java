// Task_2

// Формат входных данных:
// На первой строке вводится любимая буква Маши, на второй - Олега. Затем
// вводится строка, в которой перечислены слова, которые написаны в газете.

// Формат выходных данных:
// На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько
// слов выписал Олег.

// Sample Input:

// а
// в
// Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
// Sample Output:

// 2
// 3

package Seminar02;

public class task02 {
    public static void main(String[] args) {
        char strMary = 'f';
        char strOleg = 'd';
        String str = "Fox dog lazy Dog over dog fox fox fox fox ";
        String [] arr = str.split(" ");
        for (String string : arr) {
            System.out.println(string);
        }
        int mary = 0;
        int oleg = 0;
        for (String string : arr) {
            if (string.indexOf(strMary) != -1) {
                mary++;
            }
            if (string.indexOf(strOleg) != -1) {
                oleg++;
            }
        }
        System.out.println(mary);
        System.out.println(oleg);
    }    
}
