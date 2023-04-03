/*
 * Task_3.*
public class Task3 {

// Напишите программу, которая
// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
// 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
// 3) сохраняет файл локально
// 4) читает сохраненный файл и выводит содержимое в логгер
// 5) удаляет сохраненный файл
public static void main(String[] args) {
    String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";

}

public String download(String url, String localFilename) {

    return "";
}

public String change(String name, String fileContent) {

    return "";
}

public void read(String localFilename){

}

public void saveOnLocal(String fileName, String fileContent) {

}

public boolean removeFromLocale(String fileName) {

    return false;
}

}
 */


package Seminar02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.channels.Channels;



public class HomeWorkTask03Second {
  
    public static String download(String urlprobe, String localFilename) {

		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		String myCurrentDir = System.getProperty("user.dir");
		String myFilePath = myCurrentDir + File.separator + localFilename;

        URL url = new URL(urlprobe); 
        // create an input stream to the file InputStream 
        inputStream = url.openStream(); 
        // create a channel with this input stream 
        ReadableByteChannel channel = Channels.newChannel( url.openStream()); 
        // create an output stream 
        FileOutputStream fos = new FileOutputStream( new File(localFilename)); 
        // get output channel, read from input channel and write to it 
        fos.getChannel().transferFrom(channel, 0, Long.MAX_VALUE); 
        // close resources 
        fos.close(); 
        channel.close(); 
    return "";
}
    
    public String change(String name, String fileContent) {
    
        return "";
    }
    
    public void read(String localFilename){
    
    }
    
    public void saveOnLocal(String fileName, String fileContent) {
    
    }
    
    public boolean removeFromLocale(String fileName) {
    
        return false;
    }


    public static void main(String[] args) throws IOException {
        String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";

        String stringFromFile = download(fileUrl, "inter.txt");
        System.out.println(stringFromFile);

    }
    
   
    
    }
