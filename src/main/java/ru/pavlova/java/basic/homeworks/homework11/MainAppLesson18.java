package ru.pavlova.java.basic.homeworks.homework11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainAppLesson18 {

    public static void main(String[] args) {
        File rootFolder = new File(".");
        File[] files = rootFolder.listFiles();
        getListFiles(files);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileName = scanner.nextLine();
        File selectedFile = new File(rootFolder, fileName);
        writeToFile(scanner, selectedFile);
    }

    private static void writeToFile(Scanner scanner, File selectedFile) {
        try {
            if (selectedFile.exists() && selectedFile.isFile()) {
                System.out.println("Файл " + selectedFile.getName() + " существует.");
                System.out.println("Введите строку для записи в файл:");
                String userInput = scanner.nextLine();
                byte[] bytes = userInput.getBytes();

                try (FileOutputStream fos = new FileOutputStream(selectedFile, true)) {
                    fos.write(bytes);
                    fos.write(System.lineSeparator().getBytes());
                    System.out.println("Строка успешно записана в файл побайтово.");
                } catch (IOException e) {
                    System.out.println("Ошибка при записи в файл: " + e.getMessage());
                }
            } else {
                System.out.println("Файл " + selectedFile.getName() + " не существует или не является файлом.");
            }
        } finally {
            scanner.close();
        }
    }

    private static void getListFiles(File[] files) {
        System.out.println("Список текстовых файлов в корневом каталоге проекта:");
        String name;
        for (File file : files) {
            if (file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
                name = file.getName();
                System.out.println(name);
            }
        }
    }
}