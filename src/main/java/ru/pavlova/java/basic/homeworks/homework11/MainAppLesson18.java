package ru.pavlova.java.basic.homeworks.homework11;

import java.io.*;
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
            readBefore(selectedFile);
            if (selectedFile.exists() && selectedFile.isFile()) {
                System.out.println("Файл " + selectedFile.getName() + " существует.");
                System.out.println("Введите строку для записи в файл:");
                String userInput = scanner.nextLine();
                byte[] bytes = userInput.getBytes();

                try (FileOutputStream fos = new FileOutputStream(selectedFile, true)) {
                    fos.write(bytes);
                    fos.write(System.lineSeparator().getBytes());
                    System.out.println("Строка успешно записана в файл побайтово.");
                    readAfter(selectedFile);
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

    private static void readAfter(File selectedFile) {
        System.out.println("Содержимое файла после заполнения:");
        try (FileInputStream fis = new FileInputStream(selectedFile);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void readBefore(File selectedFile) {
        System.out.println("Содержимое файла до заполнения:");
        try (FileInputStream fis = new FileInputStream(selectedFile);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
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