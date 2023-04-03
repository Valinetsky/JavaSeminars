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

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

public class HomeWorkTask03Second {

	// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое
	// файла
	public static String download(String urlprobe, String localFilename) throws IOException {

		URL url = new URL(urlprobe);
		InputStream input = url.openStream();
		byte[] buffer = input.readAllBytes();
		String str = new String(buffer);

		saveOnLocal(localFilename, str);

		return str;
	}

	// 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
	public static String change(String name, String fileContent, String localFilename) throws IOException {
		String newStr = fileContent.replace("%s", name);

		saveOnLocal(localFilename, newStr);

		return newStr;
	}

	// 4) читает сохраненный файл и выводит содержимое в логгер
	public static void read(String localFilename) throws IOException {
		String content = Files.lines(Paths.get(localFilename)).collect(Collectors.joining(System.lineSeparator()));
		System.out.println(content);
	}

	public static void saveOnLocal(String fileName, String fileContent) throws IOException {
		// System.out.println("Working Directory = " + System.getProperty("user.dir"));
		String myCurrentDir = System.getProperty("user.dir");
		String myFilePath = myCurrentDir + File.separator + fileName;

		File file = new File(myFilePath);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(fileContent.getBytes());
		fileOutputStream.close();
	}

	public static boolean removeFromLocale(String fileName) throws IOException {
		Path path = Path.of(fileName);
		Files.delete(path);
		return false;
	}

	public static void main(String[] args) throws IOException {

		Logger LOGGER_A = Logger.getLogger(HomeWorkTask03Second.class.getName());
		LOGGER_A.setLevel(Level.ALL);
		ConsoleHandler ch = new ConsoleHandler();
		LOGGER_A.addHandler(ch);
		SimpleFormatter sf = new SimpleFormatter();
		ch.setFormatter(sf);
		LOGGER_A.log(Level.INFO, "Начало работы");

		String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";

		String stringFromFile = download(fileUrl, "inter.txt");
		// System.out.println(stringFromFile);
		LOGGER_A.log(Level.INFO, stringFromFile);

		read("inter.txt");

		change("Roman", stringFromFile, "inter.txt");

		read("inter.txt");

		removeFromLocale("inter.txt");

		LOGGER_A.log(Level.INFO, "END");

	}

}
