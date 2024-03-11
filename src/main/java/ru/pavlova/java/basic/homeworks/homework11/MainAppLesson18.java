package ru.pavlova.java.basic.homeworks.homework11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainAppLesson18 {

    public static void main(String[] args) {
        File rootFolder = new File(".");
        File[] files = rootFolder.listFiles();
        String name;
        System.out.println("Список текстовых файлов в корневом каталоге проекта:");
        for (File file : files) {
            if (file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
                name = file.getName();
                System.out.println(name);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileName = scanner.nextLine();
        File selectedFile = new File(rootFolder, fileName);
        try {
            if (selectedFile.exists() && selectedFile.isFile()) {
                System.out.println("Файл " + selectedFile.getName() + " существует.");
                System.out.println("Введите строку для записи в файл:");
                String userInput = scanner.nextLine();
                FileWriter fileWriter = new FileWriter(selectedFile, true);
                fileWriter.write(userInput + System.lineSeparator());
                fileWriter.close();

                System.out.println("Строка успешно записана в файл.");
            } else {
                System.out.println("Файл " + selectedFile.getName() + " не существует или не является файлом.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}