package Seminar02;
/*
 // Task_3

// Для того чтобы выходить в Интернет, каждому компьютеру присваивается так
// называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до
// 255, разделенных точками. В следующих трех строках показаны три правильных
// IP-адреса:

// 127.0.0.0
// 192.168.0.01
// 255.00.255.255
// Напишите программу, которая определяет, является ли заданная строка
// правильным IP-адресом.
// Входные данные
// На вход программе подается строка длиной не более 15 символов, которая
// включает цифры и точки.

// Выходные данные
// Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

// Примечание:
// У вас не получится просто так взять и создать строку, которая содержит точку.
// Иначе говоря строчка кода:

// String s = ".";
// просто на просто не сработает. Точнее сработает неверно. Для корректного
// создания строки, содержащей точку используйте экранирование.

// String s = "\\.";
// Sample Input 1:

// 192.168.1.2
// Sample Output 1:

// YES
// Sample Input 2:

// 192.11.690.0
// Sample Output 2:

// NO
// Sample Input 3:

// 67.67.67
// Sample Output 3:

// NO
 */


public class task03 {
    public static void main(String[] args) {
        String str = "192.11.690.0";
        String [] arr = str.split("\\.");
        boolean flag = true;
        for (String string : arr) {

            int foo = Integer.parseInt(string);
            System.out.println(foo);
            if (arr.length < 4 || foo < 0 || foo > 255) {
                flag = false;
                System.out.println(flag);
            }
        }
        if (flag) {
            System.out.println("Nice IP!");
        }
        if (!flag) {
            System.out.println("Wrong");
        }
    }
}
