import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Homework2{
    // 1 Дано четное число N (>0) и символы c1 и c2.
    // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    // Пример. (n = 6, c1='a', c2='b') -> "ababab"
    // (n = 8, c1='x', c2='y') -> "xyxyxyxy"
    // static String buildString(int n, char c1, char c2) {
    //     // TODO: 28.03.2023 Домашнее задание!
    //     return null;
    // }
    // 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо. Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...



    public static void main(String[] args) {
        stringInit(6, 'n', 'v');
        addText("TEXT", 100);
    }
    
    private static void stringInit(int n, char c1 ,char c2){
        String temp = "";
        if (n % 2 == 0 && n > 0){
            for (int index = 0; index < n/2; index++) {
                temp += c1;
                temp += c2;
            }
            System.out.println(temp);
        }else
        {
            System.out.println("Вы ввели не верное число");
        }
        
    }

    public static void addText(String text, int quantity){
        
        try{File file = new File("file.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int index = 0; index < quantity; index++) {
                bw.write(text);
            }
            bw.close();

    } catch(IOException e){
        System.out.println("Error" + e);
    
        }
    }
}